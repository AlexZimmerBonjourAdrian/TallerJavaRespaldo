package model;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
/*
@NamedQuery(name="Estado.buscarEstado", query="SELECT e FROM Estado e WHERE Id ")
@NamedQuery(name="Estado.agregarEstado",query="INSERT INTO e FROM Estado e value(id)")
@NamedQuery(name="Estado.eliminarEstado", query="DELETE FROM Estado e WHERE e.idperf=id")
@NamedQuery(name="Estado.modificarEstado", query="UPDATE TABLE Estado e SET e.idperf=id")
@NamedQuery(name="Estado.mostrarEstado", query="SELECT e FROM  Estado e")
*/
//@NamedQuery(name="Estado.modificarPerfil", query="UPDATE TABLE e SET e.idPer=id")

public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private int idestado;

	private String comestado;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonbDateFormat
	private Date festado;

	@Lob
	private byte[] imgestado;

	//uni-directional many-to-one association to Perfil
	@ManyToOne
	//@JoinColumn(name="idUsu")
	@JoinColumn(name="fk_perf")
	private Perfil perfil;

	public Estado() {
	}/*
	public Estado(int idEstado,String Comestado,Date Festado,byte[] image, Perfil idperf ) {
		this.idestado= idEstado;
		this.comestado=Comestado;
		this.festado=Festado;
		this.imgestado=image;
		this.perfil=idperf;
		
		
	}
*/	
	public Estado(int idEstado) {
		this.idestado= idEstado;
		/*this.comestado=Comestado;
		this.festado=Festado;
		this.imgestado=image;
		this.perfil=idperf;
		*/
		
	}


	public int getIdestado() {
		return this.idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public String getComestado() {
		return this.comestado;
	}

	public void setComestado(String comestado) {
		this.comestado = comestado;
	}

	public Date getFestado() {
		return this.festado;
	}

	public void setFestado(Date festado) {
		this.festado = festado;
	}

	public byte[] getImgestado() {
		return this.imgestado;
	}

	public void setImgestado(byte[] imgestado) {
		this.imgestado = imgestado;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}