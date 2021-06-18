package com.ecodeup.bean;

import java.sql.SQLException;
import java.sql.DriverManager;

public class Connection {

	public static void main(String[] args)
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		
		DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaalx","root","root");
		
	}catch(ClassNotFoundException e){
		System.out.println("Erro al cargar el controlador");
		e.printStackTrace();
	}
	}
}
