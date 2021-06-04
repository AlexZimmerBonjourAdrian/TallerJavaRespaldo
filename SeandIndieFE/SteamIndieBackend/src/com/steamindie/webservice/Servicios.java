package com.steamindie.webservice;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import data.Interfaz;
import model.Oferta;
import model.Usuario;

@Stateless
@LocalBean
@Path("/servicios")
public class Servicios {

	/**
     * Default constructor. 
     */
    public Servicios() {
        // TODO Auto-generated constructor stub
    }
 
    @Inject
	private Interfaz interfaz;
	
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	@Path("/usuarios/listarUsuarios")  //http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/listarUsuarios trae todos los users
	public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios =  interfaz.encontrarTodosUsuarios();
        System.out.println("Usuarios encontrados:" + usuarios);
        return usuarios;
    }
	
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/usuarios/buscarUsuario/{id}") //hace referencia al path: http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/buscarUsuario/2
    public Usuario encontrarUsuario(@PathParam("id") int id){
        Usuario usuario = interfaz.encontrarUsuario(new Usuario(id));
        System.out.println("Usuario encontrado:" + usuario);
        return usuario;
    }
	
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/usuarios/agregarUsuario") 
    public Usuario agregarUsuario(Usuario usuario){
    	interfaz.insertarUsuario(usuario);
        System.out.println("Usuario agregado:" + usuario);
        return usuario;
    }
	
	@PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/usuarios/editarUsuario{id}")
    public Response modificarUsuario(@PathParam("id") int id, Usuario usuarioModificado){
        Usuario usuario = interfaz.encontrarUsuario( new Usuario(id));
        if(usuario != null){
        	interfaz.actualizarUsuario(usuarioModificado);
            System.out.println("Usuario modificado:" + usuarioModificado);
            return Response.ok().entity(usuarioModificado).build();
        }
        else{
            return Response.status(Status.NOT_FOUND).build();
        }
    }
	
	@DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/usuarios/eliminarUsuario/{id}")
    public Response eliminarUsuario(@PathParam("id") int id){
    	interfaz.eliminarUsuario(new Usuario(id));
        System.out.println("Usuario eliminado con el id:" + id);
        return Response.ok().build();
    }
	
	
	
//	OFERTAS

	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/ofertas/agregarOferta") 
    public Oferta agregarOferta(Oferta oferta){
    	interfaz.insertarOferta(oferta);
        System.out.println("Oferta agregada:" + oferta);
        return oferta;
    }
	
	
}
