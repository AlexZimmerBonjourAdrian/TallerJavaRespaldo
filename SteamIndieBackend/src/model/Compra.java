package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the compra database table.
 * 
 */
@Entity
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int idCompra;

	private String calcom;

	private String comcom;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fcom;

	//uni-directional many-to-one association to Juego
	@ManyToOne
	@JoinColumn(name="IdJuego")
	private Juego juego;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsu")
	private Usuario usuario;

	public Compra() {
	}

	public int getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public String getCalcom() {
		return this.calcom;
	}

	public void setCalcom(String calcom) {
		this.calcom = calcom;
	}

	public String getComcom() {
		return this.comcom;
	}

	public void setComcom(String comcom) {
		this.comcom = comcom;
	}

	public Date getFcom() {
		return this.fcom;
	}

	public void setFcom(Date fcom) {
		this.fcom = fcom;
	}

	public Juego getJuego() {
		return this.juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}