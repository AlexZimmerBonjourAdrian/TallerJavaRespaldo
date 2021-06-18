package com.ecodeup.bean;

import java.util.Date;

public class Usuario {
	
	
	private int IdUsu;
	private String nickname;
	private String password;
	private String nombre;
	private String apellido;
	private Date fnac;
	public int getIdUsu() {
		return IdUsu;
	}
	public void setIdUsu(int idUsu) {
		IdUsu = idUsu;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFnac() {
		return fnac;
	}
	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}
	
	
}
