package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the juego database table.
 * 
 */
@Entity
@NamedQuery(name="Juego.findAll", query="SELECT j FROM Juego j")
public class Juego implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int idJuego;

	private String idMongo;

	private String nomjuego;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsu")
	private Usuario usuario;

	public Juego() {
	}

	public int getIdJuego() {
		return this.idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getIdMongo() {
		return this.idMongo;
	}

	public void setIdMongo(String idMongo) {
		this.idMongo = idMongo;
	}

	public String getNomjuego() {
		return this.nomjuego;
	}

	public void setNomjuego(String nomjuego) {
		this.nomjuego = nomjuego;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}