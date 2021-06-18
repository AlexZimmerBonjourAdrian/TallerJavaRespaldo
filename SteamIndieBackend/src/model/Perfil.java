package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p"),
//@NamedQuery(name="Perfil.MostrarPerfil", query="SELECT p FROM Perfil p "),
//@NamedQuery(name="Perfil.agregarPerfil", query="Insert INTP Perifl value(:id)")
//@NamedQuery(name="Perfil.agregarPerfil", query="INSERT INTO Perfil")
//@NamedQuery(name="Perfil.MostrarPerfil", query="SELECT p  FROM Perfil p "+"INNER JOIN P.ID ON Estado.idperf=p.idperf"),
//@NamedQuery(name="Perfil.encontrarPerfil", query="SELECT p FROM Perfil p where p"),
//@NamedQuery(name="Perfil.eliminarPerfil", query="DELETE FROM Perfil p where p.idperf=:id "),
//@NamedQuery(name="Perfil.actualizarPerfil", query="UPDATE Perfil p SET p.idperf=:id WHERE p.idperf=:id"),
//@NamedQuery(name="Perfil.mostarPrfil",query="SELECT p " + "FROM Perfil p "+ " WHERE p.idperf IN (SELECT e FROM Estado e WHERE p.idperf = e.idperf)"),
 //@NamedQuery(name="Perfil.agegarPerfil", query="INSERT INTO Perfil"),
})
//@NameQuery(name="Perfil.InsertarPerfil", query="Insert into  Perfil values(a,b,c,d,e,g)")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=true, updatable=false)
	private int idperf;

	public Perfil() {
	}
	public Perfil(int idperf) {
		this.idperf = idperf;
	}

	public int getIdperf() {
		return this.idperf;
	}

	public void setIdperf(int idperf) {
		this.idperf = idperf;
	}

}