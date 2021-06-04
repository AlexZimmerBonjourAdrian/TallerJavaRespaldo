package data;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Oferta;
import model.Usuario;;

@Stateless
public class InterfazImpl implements Interfaz{
	
	// USUARIOS
	
	@PersistenceContext (unitName = "SteamIndie")
	EntityManager em;
	
	public List<Usuario> encontrarTodosUsuarios() {
        return em.createNamedQuery("Usuario.encontrarTodosUsuarios", Usuario.class ).getResultList();
    }

    @Override
    public Usuario encontrarUsuario(Usuario usuario) {
    	
       return em.find(Usuario.class, usuario.getIdUsu());
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        em.persist(usuario);
        em.flush();
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }

	// OFERTAS
    
    @Override
    public void insertarOferta(Oferta oferta) {
        em.persist(oferta);
        em.flush();
    }

}

