package data;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Oferta;
import model.Usuario;
import model.Perfil;
import model.Estado;

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

    //Perfiles
    @Override
    public List<Perfil> findAll() {
        return em.createNamedQuery("Perfil.findAll", Perfil.class ).getResultList();
    }
    
    @Override
    public void eliminarPerfil(Perfil perfil)
    {
    	em.remove((em.merge(perfil)));
    }
    @Override
    public void actuaizarPerfil(Perfil perfil)
    {
    	em.merge(perfil);
    }
    
    @Override
    public Perfil encontrarPerfil(Perfil perfil)
    {
    	return em.find(Perfil.class, perfil.getIdperf());
    }
    
    @Override
    public void insertarPerfil(Perfil perfil) {
    	em.persist(perfil);
    }
    @Override
    public Estado encontrarEstado(Estado estado)
    {
    	return em.find(Estado.class,estado.getIdestado());
    }
    @Override
    public void insertarEstado(Estado estado)
    {
    	 em.persist(estado);
    }
    @Override
    public void eliminarEstado(Estado estado)
    {
    	em.remove(em.merge(estado));
    }
    @Override
    public void actualizarEstado(Estado estado)
    
    {
    	em.merge(estado);
    }
    public List<Estado> encontrarTodosEstados() {
        return em.createNamedQuery("Estado.findAll", Estado.class ).getResultList();
    }

    
    
	// OFERTAS
    
    @Override
    public void insertarOferta(Oferta oferta) {
        em.persist(oferta);
        em.flush();
    }

}

