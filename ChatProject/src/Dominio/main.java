package Dominio;
import java.util.Scanner;



import Controller.Controller;
public class main {



	public static void main(String[] args) 
	
	{
		while(true)
		{
		Controller con= Controller.getController();
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese nombre de Usuario\n");
		String NickName= scan.nextLine();
		//System.out.print(NickName);
		
		System.out.print("Ingrese Commentario\n\n");
		
		String Chat= scan.nextLine();
		//System.out.print(Chat);
		con.RealizarPublicacion(NickName,Chat);
		
		System.out.print("Comentarios");
		con.ListComentario();
		}
	
		
		
	}

}