package com.ecodeup.bean;

import java.awt.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.ecodeup.Logic.Usuario;




@ManagedBean(name="Usuario")
@SessionScoped
@RequestScoped

public class UsuarioBean {

	//private Usuario usuario = new Usuario();
	private ArrayList<Usuario> lstUsuario = new ArrayList<Usuario>();
	/*
	public Usuario getUsuario()
	{
		return usuario;
	}
	
	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	
	public ArrayList<Usuario> getListUsuario()
	{
		return lstUsuario;
	}
	
	public void setListUsuario(ArrayList<Usuario> listUsuario)
	{
	 this.lstUsuario = listUsuario;	
	 
	}
	
	public void registrar()
	{
		this.lstUsuario.add(this.usuario);
	}
	*/
	
}
