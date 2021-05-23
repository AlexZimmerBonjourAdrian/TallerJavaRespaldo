package Dominio;
import java.util.Scanner;

//import com.sun.tools.javac.util.Context.Key;

import java.awt.event.KeyAdapter ;    
import java.awt.event.KeyEvent ;
import Dominio.*;



import Controller.Controller;
public class main {



	//private static final boolean KeyEvent = 'W';

	public static void main(String[] args) 
	
	{
		
		Controller con= Controller.getController();
		//System.out.print("Precione Ctrl para salir ");
		int id = 1;
		while(id <= 3)
		{
		//Controller con= Controller.getController();
		Scanner scan = new Scanner(System.in);
		System.out.print("\n"+ "Ingrese nombre de Usuario" + "\n");
		String NickName= scan.nextLine();
		//System.out.print(NickName);
		
		System.out.print("\n"+ "Ingrese Commentario" + "\n");
		
		String Chat= scan.nextLine();
		//System.out.print(Chat);
		con.RealizarPublicacion(NickName,Chat);
		
		//System.out.print("Comentarios");
		con.ListComentario();
		id++;
		}
		
		 CrearArchivo file = new CrearArchivo();
		file.Creararchivo(Controller.getController().getUsuario(),Controller.getController().getChats());
		
	
		
		
	}

}