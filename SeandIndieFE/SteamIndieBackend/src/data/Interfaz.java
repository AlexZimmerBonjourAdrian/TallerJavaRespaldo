package data;

import java.util.List;

import model.Oferta;
import model.Usuario;

public interface Interfaz {

	// USUARIOS
	
	public List<Usuario> encontrarTodosUsuarios();
    
    public Usuario encontrarUsuario(Usuario usuario);
    
    public void insertarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
    
	// OFERTAS
    public void insertarOferta(Oferta oferta);
}
