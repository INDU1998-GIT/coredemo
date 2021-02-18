package com.valuemomentum.training.Inputoutputpackage;
import java.io.*;
public class deserializeDemo {

	public static void main(String[] args) {
		
		
		Employee e=null;
		try
		{
			FileInputStream filein=new FileInputStream("c:/demo/employee.ser");
			ObjectInputStream in=new ObjectInputStream(filein);
			e=(Employee)in.readObject();
			in.close();
			filein.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			
			
		}
	
	catch(ClassNotFoundException c)
		{
		System.out.println(" employee class not found");
		c.printStackTrace();
		return;
		
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name:" +e.name);
		System.out.println("Address:" +e.address);
		System.out.println("SSN:" +e.SSN);
		System.out.println("Number:" +e.number);
		}

}
