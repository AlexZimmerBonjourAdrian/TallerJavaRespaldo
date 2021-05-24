package Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Controller.Controller;

public class LeerArchivoyCargar {
	
	public void LeerArchivoyCargarlo()
	{
		Controller con= Controller.getController();
		String ruta = "C:\\Users\\Alex2\\Desktop/File.txt";
		File myObj = new File(ruta);
		try {
		
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine())
			{
				String User=" ";
				String Chat= " ";
				String data = myReader.nextLine();
				//System.out.print(data + "\n");
				if(data.contains("<User>"))
				{
					User=data + "\n";
					//System.out.print(User);
					
				}
				
				if(data.contains("<Chat>"))
				{
					Chat=data + "\n";
					//System.out.print(Chat);
				}
				
				con.RealizarPublicacion(User,Chat);
				//con.ListComentario();
			}
			
			myReader.close();
		}catch(FileNotFoundException e)
		{
			System.out.print("An error occurred.");
			e.printStackTrace();
		}
		/*
		if(myObj.exists())	
		{	
			System.out.print("\n File name: " + myObj.getName());
			//System.out.print("\n Absolute path: " + myObj.getAbsolutePath());
		//	System.out.print("\n Writeable: " + myObj.canWrite());
			//System.out.print(" \n Readable " + myObj.length());
			//System.out.print("\n File size in byte " + myObj.length());
		}else {
			System.out.print("The file does not exist.");
			
		}
		*/
	}
	
	

}
