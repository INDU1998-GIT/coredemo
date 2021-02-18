package com.valuemomentum.training.Inputoutputpackage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
public class FileClass {

	public static void main(String[] args) {
		
		File f=new File("c:/test/ Hello.txt");
		
		try
		{
			
			if(f.createNewFile())
			{
				System.out.println("new file created!");
			}
			else
			{
				System.out.println("The file already exists");
		
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
	
			System.out.println("name of the file:" +f.getName());
			System.out.println("path of the file:" +f.getPath());
			System.out.println("file last modified" +new Date(f.lastModified()));
			System.out.println("parent directory" +f.getParent());
			System.out.println("Size of the file" +f.length()+ " Bytes");
			
		

	}

}
