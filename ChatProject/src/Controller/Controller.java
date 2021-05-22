package Controller;


import Dominio.Chat;
import java.util.Arrays;
import java.util.ArrayList;
import Dominio.Usuario;
import Dominio.*;


public class Controller {

	private ArrayList<Usuario> ListUser = new ArrayList<Usuario>();
	private ArrayList<Chat>ListChat = new ArrayList<Chat>();
	int ChatIndex=0;
	private static Controller Init=null;
	
	public static Controller getController()
	
	{
		if(Init== null)
		{
			Init = new Controller();
		}
		return Init;
	}
	
	
	
	

	public void RealizarPublicacion(String NickName, String Chat )
	{
		ChatIndex += 1;
		Chat Commentario = new Chat(ChatIndex, NickName,Chat);
		ListChat.add(Commentario);
		
		
		
	}
	public void AgregarUsuario(int idUsuario, String NickName, String Password)
	{
		Usuario User= new Usuario(idUsuario, NickName,Password);
		ListUser.add(User);
	}
	/*
	public void AgregarUsuario(int idUsuario, String NickName, String Password)
	{
		Usuario User=  new Usuario(idUsuario ,NickName, Password);
		Listusuario[idUsuario] = User;
	}
	public void ListUsuario()
	{
		for(int i = 0; i >=Listusuario.length; i++)
		{
			if(Listusuario[i]!= null)
			{
			 System.out.print(Listusuario[i]);
			}
			else
			{
				return;
			}
		}
		
	}
	

	
	private void setListChat(Chat Commentario)
	{
		
	}
	
	
	
	
	/*
	public void DeleteUsuario()
	{
		
	}
	*/
	
	
	public void ListUsuario()
	{
		for(int i=ListUser.size() - 1; 0 <= i ; i--)
		{
			//if(ListChat.isEmpty() != false)
			//{
				
				
			//System.out.print("Entra");
			System.out.print(ListUser + "\n");
			//}
		}
		
	}
	
	public void ListComentario()
	{
		for(int i=ListChat.size() - 1; 0 <= i ; i--)
		{
			//if(ListChat.isEmpty() != false)
			//{
				
				
			//System.out.print("Entra");
			System.out.print(ListChat.get(i).getChat() + "\n");
			//}
		}
			
	}
	
	private void setEditCoentarie(String NickName, String Commentario)
		{
		  for (Chat element : ListChat){
		         if (element.getNameUser() == NickName)
		         {
		              element.seChat(NickName);
		         }
		  }
	}
	
	private void SetNickNameUser(String NickName, String newNickName)
	{
		for(Usuario element : ListUser)
			if(element.GetNickName() == NickName)
		{
			element.SetNickName(newNickName);
		}
		for(Chat element : ListChat)
		{
			if(element.getNameUser() == NickName)
			{
			element.setNameUser(newNickName);
			}
		}
	}
}
