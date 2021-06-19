package Data;

import java.sql.Date;

public class DTUsuario  {
	
	private 
	 int idUsu;
	 String nombre;
	 String apellido;
	 String password;
	 String nickName;
	 Date fnac;
	 
	 public DTUsuario( String nombre,String apellido,String password,String nickname,Date fnac)
	 {
		 this.nombre=nombre;
		 this.apellido = apellido;
		 this.password = password;
		 this.nickName= nickname;
		 this.fnac = fnac;
	 }
	 
	public int getIdUsu() {
		return idUsu;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getPassword() {
		return password;
	}
	public String getNickName() {
		return nickName;
	}
	
	public Date getFnac() {
		return fnac;
	}
	


	
	 
	 
	
	
	
}
