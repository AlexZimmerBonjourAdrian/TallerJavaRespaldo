package data;

import java.util.List;

import model.Oferta;
import model.Usuario;
import model.Perfil;
import model.Estado;

public interface Interfaz {

	// USUARIOS
	
	public List<Usuario> encontrarTodosUsuarios();
    
    public Usuario encontrarUsuario(Usuario usuario);
    
    public void insertarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
    //Perfil
   public List<Perfil> findAll();
  public Perfil encontrarPerfil(Perfil perfil);
    public void insertarPerfil(Perfil perfil);
    public void actuaizarPerfil(Perfil perfil);
    public void eliminarPerfil(Perfil perfil);
    
    
    //Estado
    public List<Estado> encontrarTodosEstados();
    public Estado encontrarEstado(Estado estad);
   public void insertarEstado(Estado estado);
    public void eliminarEstado(Estado estado);
    public void actualizarEstado(Estado estado);
    
    
    
	// OFERTAS
    public void insertarOferta(Oferta oferta);
}
