package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oferta database table.
 * 
 */
@Entity
@NamedQuery(name="Oferta.findAll", query="SELECT o FROM Oferta o")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int idoferta;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ffinof;

	@Temporal(TemporalType.TIMESTAMP)
	private Date finiof;

	private String nominstof;

	private int porcentof;

	public Oferta() {
	}

	public int getIdoferta() {
		return this.idoferta;
	}

	public void setIdoferta(int idoferta) {
		this.idoferta = idoferta;
	}

	public Date getFfinof() {
		return this.ffinof;
	}

	public void setFfinof(Date ffinof) {
		this.ffinof = ffinof;
	}

	public Date getFiniof() {
		return this.finiof;
	}

	public void setFiniof(Date finiof) {
		this.finiof = finiof;
	}

	public String getNominstof() {
		return this.nominstof;
	}

	public void setNominstof(String nominstof) {
		this.nominstof = nominstof;
	}

	public int getPorcentof() {
		return this.porcentof;
	}

	public void setPorcentof(int porcentof) {
		this.porcentof = porcentof;
	}

}