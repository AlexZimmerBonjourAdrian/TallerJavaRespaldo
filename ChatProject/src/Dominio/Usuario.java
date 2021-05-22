package Dominio;

public class Usuario {

	private String password;
	private String NickName;
	private int idUsuario;
	
	public Usuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
	}
	public Usuario(int idUsuario, String Password,String NickName)
	{
		super();
		this.idUsuario = idUsuario;
		this.password = Password;
		this.NickName = NickName;
	}
	
	public int GetIdUsuario()
	
	{
	return this.idUsuario;	
	}
	
	
	public String GetPassword()
	{
		return this.password;
	}
	public String GetNickName()
	{
		return this.NickName;
	}
	
	public void setIdUsuario(int IdUsuario)
	
	{
	 	this.idUsuario = IdUsuario;
	}
	
	public void setPassword(String Password)
	{
		this.password = Password;
	}
	
	public void SetNickName(String NickName)
	{
		this.NickName = NickName;
	}
	}
