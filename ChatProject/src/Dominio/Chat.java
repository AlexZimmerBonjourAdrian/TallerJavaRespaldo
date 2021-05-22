package Dominio;

public class Chat {

	public int idChat;
	private String NameUser;
	private String Chat;
	
	public Chat()
	
	{
		
	}
	
	public  Chat(int idChat,String NameUser, String Chat )
	{
		this.idChat= idChat;
		this.NameUser = NameUser;
		this.Chat = Chat;
		
	}
	
	public void seChat(String Chat)
	{
		this.Chat = Chat;
	}
	
	public void setNameUser(String NameUser)
	{
		this.NameUser = NameUser;
	}
	
	public int getidChat()
	
	{
		return this.idChat;
		}
	public String getNameUser()
	{
		return this.NameUser;
	}
	
	public String getChat()
	{
		return Chat;
	}
	
	
	
	
}



