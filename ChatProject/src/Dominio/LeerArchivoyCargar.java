package Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerArchivoyCargar {
	
	public void LeerArchivoyCargar(ArrayList<Chat>ListChat )
	{
		String ruta = "C:\\Users\\Alex2\\Desktop/File.txt";
		File myObj = new File(ruta);
		try {
			
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine())
			{
				
				String data = myReader.nextLine();
				//System.out.print(data + "\n");
				if(data.contains("<User>") && data.contains("<Chat>"))
				{/*
					for(Chat element: ListChat)
					{
						element.setNameUser(data);
					}
					*/
				}
				
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
