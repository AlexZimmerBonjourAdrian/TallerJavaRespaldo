package com.ecodeup.Logic;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.ecodeup.Logic.*;
import com.ecodeup.bean.*;
public class Controller {
	
	//private static final String  = null;
	/*Conexion conexion = new Conexion();*/
	Connection cn=null;
	Statement stm=null;
	//ResultSet rs = null;
	
	private Usuario[] usuarios;
	/*private Juego[] juegos;
	private Comentario[] comentarios;
	
*/
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn=null;
		Statement stm=null;
		ResultSet rs = null;
		
		try {
			
			
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuario");
			
			while(rs.next()){
			  int idUsuario = rs.getInt(1);
			  String usuario = rs.getString(2);
			  String clave = rs.getString(3);
			  
			  System.out.println(idUsuario + " - " + usuario + " - " + clave );
			  
			}
			
			
			}catch(SQLException e)
			{
				e.printStackTrace();
				//TODO: handle exception
			}finally
			{
				try {
					if(rs!=null)
					{
						rs.close();
					}
					if(stm != null)
					{
						stm.close();
					}
					if(cn != null)
					{
						cn.close();
					}
					
				} catch(Exception e2) {
					e2.printStackTrace();
				}
			}
			
}

	public Usuario CrearUsuario(String nombre,String apellido,String email,String password,String nickname,Date fnac)
	{
		Usuario user = new Usuario( nombre, apellido, email, password, nickname,fnac);
		return user;
		
	}
	
	public void AgregaralaBaseDeDatos(Usuario user)
	{
		try 
		{
			PreparedStatement miSentencia=cn.prepareStatement("INSERT INTO usuario (idUsu, nomUsu,apellUsu,emailUsu,passwordUsu,fnac)" + "values(?,?,?,?,?,?)");
			miSentencia.setInt(1,user.getIdUsu());
			miSentencia.setString(2,user.getNombre());
			miSentencia.setString(3, user.getApellido());
			miSentencia.setString(4,user.getNickname());
			miSentencia.setString(5,user.getPassword());
			miSentencia.setDate(6,user.getFnac());
		
			ResultSet rs=miSentencia.executeQuery();
			
			while(rs.next())	
			{
				
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void registrarUsuario(String nombre,String apellido,String email,String password,String nickname,Date fnac)
	{
		 AgregaralaBaseDeDatos(CrearUsuario(nombre,apellido,email,password,nickname,fnac));
	}
	
	public void LoginUsuario(String email, String password)
	{
		
	}
	
  /*
	private DTUsuario RegistrarUsuario(String nombre,String apellido,String email,String password,String nickname,Date fnac)
	{
		
		
	
		
		Usuario usuario = new Usuario( nombre,apellido, password,nickname, fnac);
		//String query = "insert Into Usuario "+" values(nombre + apellido + email + nickname + password + fnac )"
		
		//rs = stm.executeQuery(())
		
		
			
		
		
		
		
		
		
		
		
	}
	*/
}
