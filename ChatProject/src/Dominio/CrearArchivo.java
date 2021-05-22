package Dominio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class CrearArchivo {
	
public void Creararchivo()
{
	try {
		
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
		//-----------------------------------------
		
		} catch (Exception e) {
		 e.printStackTrace();
		}	
	}
}
	

