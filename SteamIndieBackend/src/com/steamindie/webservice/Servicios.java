package com.steamindie.webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.dmr.JSONParser;
import org.jboss.resteasy.annotations.Body;

import data.Interfaz;
import data.InterfazImpl;
import model.Oferta;
import model.Usuario;
import model.Perfil;
import model.Estado;

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
        Usuario usuario = interfaz.encontrarUsuario(new Usuario(id, null, null, null, null, null, null));
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
        Usuario usuario = interfaz.encontrarUsuario( new Usuario(id, null, null, null, null, null, null));
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
    	interfaz.eliminarUsuario(new Usuario(id, null, null, null, null, null, null));
        System.out.println("Usuario eliminado con el id:" + id);
        return Response.ok().build();
    }
	
	
	//Perfil
	
	/*
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/perfiles/agregarPerfil/")
	public Perfil agregarPerfil(Perfil perfil)
	{
		
		Perfil newPerfil = interfaz.insertarPerfil(new Perfil(perfil.getIdperf());//insertarPerfil(new Perfil(perfil.getIdperf()));
		System.out.println("perfil agregado" + perfil);
		return newPerfil;
	
		
		interfaz.insertarPerfil(perfil);
		System.out.println("Se a agregado el Perfil" + perfil);
	
		return perfil;
		
		@GET
	    @Produces(value = MediaType.APPLICATION_JSON)
	    @Path("/perfiles/encontrarPerfil/{id}") //hace referencia al path: http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/buscarUsuario/2
	    public Perfil encontrarPerfil(@PathParam("id") int id){
	        Perfil perfil = interfaz.encontrarPerfil(new Perfil(id));
	        System.out.println("perfil encontrado:" + perfil);
	        return perfil;
	    }
	    

	}
*/
	
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/perfiles/listarPerfiles")
	public List<Perfil> listarPerfiles(){
		List<Perfil> perfiles = interfaz.findAll();
		System.out.println("Perfiles encontrados:" + perfiles);
		return perfiles;
		
		
	}
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/perfiles/encontrarPerfil/{id}") //hace referencia al path: http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/buscarUsuario/2
    public Perfil encontrarPerfil(@PathParam("id") int id){
        Perfil perfil = interfaz.encontrarPerfil(new Perfil(id));
        System.out.println("perfil encontrado:" + perfil);
        return perfil;
    }
	
	
	
	@DELETE
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/perfiles/eliminarPerfil/{id}")
	public Response eiliminarPerfil(@PathParam("id") int id)
	{
		interfaz.eliminarPerfil(new Perfil(id));
		System.out.println("Perfil eliminado con el id:" + id);
		return Response.ok().build();
	}
	
	@PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/perfiles/editarPerfil{id}")
    public Response modificarPerfil(@PathParam("id") int id, Perfil perfilModificado){
        Perfil perfil = interfaz.encontrarPerfil(new Perfil(id));
        if(perfil != null){
        	interfaz.encontrarPerfil(perfilModificado);
            System.out.println("Perfil modificado:" + perfilModificado);
            return Response.ok().entity(perfilModificado).build();
        }
        else{
            return Response.status(Status.NOT_FOUND).build();
        }
    }
	
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/perfiles/agregarPerfil") 
    public Perfil agregarPerfil(Perfil perfil){
		//Perfil newperf=
    // Perfil perf = new Perfil(id);
		//interfaz.insertarPerfil(perf);
		
    	interfaz.insertarPerfil(perfil);
        System.out.println("Perfil agregado:" + perfil);
        return perfil;
    }
	
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/estados/buscarEstado/{id}") //hace referencia al path: http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/buscarUsuario/2
    public Estado encontrarEstado(@PathParam("id") int id){
        Estado estado = interfaz.encontrarEstado(new Estado(id) );
        System.out.println("Estado encontrado:" + estado);
        return estado;
    }
	
	@POST
	
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@JsonbDateFormat(value = "yyyy-MM-dd")
	@Path("/estados/agregareEstado") 
    public Estado agregarEstado(Estado estado){
	
		//DateFormat df=new SimpleDateFormat("yyyy-mmm-dd HH:MM");
		
		//Estado newEstado = new Estado(estado.getIdestado(),estado.getFestado(),estado.getImgestado(),estado.getComestado(),estado.getPerfil().getIdperf());
    	//interfaz.insertarEstado(estado);
        System.out.println("Estado agregado:" + estado);
        return estado;
    }
	
	@PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/estados/editarEstado{id}")
    public Response modificarEstado(@PathParam("id") int id, Estado estadoModificado){
        Estado estado = interfaz.encontrarEstado( new Estado(id));
        if(estado != null){
        	interfaz.actualizarEstado(estadoModificado);
            System.out.println("Estado modificado:" + estadoModificado);
            return Response.ok().entity(estadoModificado).build();
        }
        else{
            return Response.status(Status.NOT_FOUND).build();
        }
    }
	
	
	@DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/estados/eliminarEstado/{id}")
    public Response eliminarEstado(@PathParam("id") int id){
    	interfaz.eliminarEstado(new Estado(id));
        System.out.println("Estado eliminado con el id:" + id);
        return Response.ok().build();
    }
	
	@GET
    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/estados/listarEstados")
	public List<Estado> listarEstados(){
		List<Estado> estados = interfaz.encontrarTodosEstados();
		System.out.println("Perfiles encontrados:" + estados);
		return estados;
		
	}
	
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	@Path("/estados/monstrarEstadosDePerfil/{id}/mostrarEstados")
	public List<Estado> monstrarEstadosDePerfil (@PathParam("id") int id)
	{
		List<Estado> estados = interfaz.encontrarTodosEstados();
		//Perfil perfil = interfaz.encontrarPerfil(new Perfil(id))
		List<Estado> newEstados = new ArrayList<>();
		
		
		for(Estado elemento : estados)
		{
			
			
			if(elemento.getPerfil().getIdperf() == perfil.getIdperf())
			{
				newEstados.add(elemento);
			}
		
	
			
		}
		
		 System.out.println("Estados encontrados:" + estados);
		return newEstados;
	}
		
		
	
/*
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	@Path("/estados/monstrarEstadosDePerfil{id}")  //http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/listarUsuarios trae todos los users
	public List<Estado> mostrarEstadosDePerfil(){
        List<Estado> estados =  interfaz.encontrarTodosEstados();
        System.out.println("Usuarios encontrados:" + estados);
        return estados;
    }
	*/
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value=MediaType.APPLICATION_JSON)
	@Path("/estados/realizarPublicacion/{id}")
	public Estado realizarPublicacion(Estado estado)
	{
		/*
		interfaz.insertarPerfil(perfil);
		System.out.println("Se a agregado el Perfil" + perfil);
		return perfil;
		*/
		
		interfaz.insertarEstado(estado);
		 System.out.println("Estado agregado:" + estado);
		return estado;
		
	//	public Perfil agregarPerfil(Perfil perfil)
	//
		/*{
		interfaz.insertarPerfil(perfil);
		System.out.println("Se a agregado el Perfil" + perfil);
		return perfil;

	}
	*/
		/*
		
		   Usuario usuario = interfaz.encontrarUsuario( new Usuario(id));
	        if(usuario != null){
	        	interfaz.actualizarUsuario(usuarioModificado);
	            System.out.println("Usuario modificado:" + usuarioModificado);
	            return Response.ok().entity(usuarioModificado).build();
	        }
	        else{
	            return Response.status(Status.NOT_FOUND).build();
	        }
	        */
	}
	
	/*
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/estados/monstrarPerfil/{id}")
	 public Estado encontrarEstado(@PathParam("id") int id){
        Estado estado = interfaz.encontrarEstado(new Estado(id));
        System.out.println("Estado encontrado:" + estado);
        return estado;
	
	
	/*
			
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	@Path("/usuarios/listarUsuarios")  //http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/listarUsuarios trae todos los users
	public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios =  interfaz.encontrarTodosUsuarios();
        System.out.println("Usuarios encontrados:" + usuarios);
        return usuarios;
    }
    */
	
	//@Path("/usuarios/listarUsuarios")  //http://localhost:8080/SteamIndieBackend/rest/servicios/usuarios/listarUsuarios
	
	/*
	@POST
	  @Consumes(value = MediaType.APPLICATION_JSON)
	    @Produces(value = MediaType.APPLICATION_JSON)
	@Path("/estado/eliminarEstado/{id}")
	public Response eliminarPerfil(@PathParam("id") int id)
	{
		interfaz.eliminarPerfil(new Perfil(id));
		System.out.println("Se a eliminado e perfil con el id:" + id);
		return Response.ok().build();
	}
	*/
	/*
	@Path("/usuarios/eliminarUsuario/{id}")
    public Response eliminarUsuario(@PathParam("id") int id){
    	interfaz.eliminarUsuario(new Usuario(id));
        System.out.println("Usuario eliminado con el id:" + id);
        return Response.ok().build();
    }
    */
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
