package com.ecodeup.bean;

import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.ecodeup.bean.TestConexion;
public class Controller {
	
	Conexion conexion = new Conexion();
	Connection cn=null;
	Statement stm=null;
	//ResultSet rs = null;
	
	private Usuario[] usuarios;
	private Juego[] juegos;
	private Comentario[] comentarios;
	

	
 
  
  /*
	private DTUsuario RegistrarUsuario(String nombre,String apellido,String email,String password,String nickname,Date fnac)
	{
		
		
	
		
		Usuario usuario = new Usuario( nombre,apellido, password,nickname, fnac);
		//String query = "insert Into Usuario "+" values(nombre + apellido + email + nickname + password + fnac )"
		
		//rs = stm.executeQuery(())
		
		
			
		
		
		
		
		
		
		
		
	}
	*/
}
