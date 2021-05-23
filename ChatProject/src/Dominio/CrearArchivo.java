package Dominio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import Controller.Controller;
public class CrearArchivo {
	
public void Creararchivo(ArrayList<Usuario> ListUser , ArrayList<Chat>ListChat )
{
	try {
		//Controller con= Controller.getController();
		 //CrearArchivo file = new CrearArchivo();
		String ruta = "C:\\Users\\Alex2\\Desktop/File.txt";
		//String contenido = con.ListComentario().toString();
		//String contenido = con.ListComentario().toString();
			File file = new File(ruta);
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
		
		for(Chat element: ListChat)
		{
			if(element != null)
			{
				
		       // BufferedWriter bw = new BufferedWriter(fw);
		        bw.write(element.getChat());
			}
		}
		  bw.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
		/*
		File file = new File(ruta);
		
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		*/
		//FileWriter fw = new FileWriter(file);
      
        //bw.write(contenido);
      
		
		/*
		String ruta = "C:\\Users\\Alex2\\Desktop/File.txt";
		String contenido = "contenido de ejemplo";
		
		File file = new File(ruta);
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		//La escritura se hace en esta seccion
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contenido);
		bw.close();
		*/
		//-----------------------------------------
		/*
		} catch (Exception e) {
		 e.printStackTrace();
		}	
		*/
	}
}
	

