package com.ecodeup.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="juego")
@SessionScoped
public class Juego {
	
	private int IdJuego;
	private String Name;
	private float precio=20.99f;
	private String image;
	private String URLVideo;
	private int puntaje;
	private  Comentario[] Comentarios;
	public int getIdJuego() {
		return IdJuego;
	}
	public void setIdJuego(int idJuego) {
		IdJuego = idJuego;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getURLVideo() {
		return URLVideo;
	}
	public void setURLVideo(String uRLVideo) {
		URLVideo = uRLVideo;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public Comentario[] getComentarios() {
		return Comentarios;
	}
	public void setComentarios(Comentario[] comentarios) {
		Comentarios = comentarios;
	}
	
}
