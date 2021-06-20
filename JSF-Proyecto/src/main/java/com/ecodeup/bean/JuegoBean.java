package com.ecodeup.bean;

import java.util.ArrayList;

import com.ecodeup.Logic.Juego;
import com.ecodeup.Logic.Usuario;

public class JuegoBean {

	private Juego juego = new Juego();
	
	private ArrayList<Juego> lstJuego=new ArrayList<Juego>();
	
	
	public void setJuego(Juego juego)
	{
		this.juego=juego;
	}
	
	public Juego getJuego(Juego juego)
	{
		return juego;
	}
	
	
	public ArrayList<Juego> getListJuego()
	{
		return lstJuego;
	}
	
	public void setListJuego(ArrayList<Juego> lstJuego)
	{
		
		this.lstJuego = lstJuego;
		
	}
	
	public void registrar()
	{
		this.lstJuego.add(this.juego);
	}
	

}
