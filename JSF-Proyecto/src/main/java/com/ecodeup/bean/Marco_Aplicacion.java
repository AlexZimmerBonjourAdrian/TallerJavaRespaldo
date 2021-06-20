package com.ecodeup.bean;


import javax.swing.*;

import java.awt.*;



class Aplicacion_Consulta{
	
	public static void main(String[] args)
	{
		JFrame mimarco= new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		
		mimarco.setVisible(true);
		
	}
}

public class Marco_Aplicacion extends JFrame {

	public Marco_Aplicacion()
	{
		setTitle("Consulta BBDD");
		
		setBounds(500,300,500,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		JComboBox secciones = new JComboBox();
		secciones.setEditable(false);
		secciones.addItem("Todos");
		JComboBox paises=new JComboBox();
		paises.setEditable(false);
		paises.addItem("Todos");
		JTextArea resultado = new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		
		menus.add(secciones);
		menus.add(paises);
		add(menus,BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta= new JButton("Consulta");
		add(botonConsulta,BorderLayout.SOUTH);
		
	}
	
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;
	
}
