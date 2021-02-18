package com.valuemomentum.training.Inputoutputpackage;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	

	public static void main(String[] args) {
		try { 
			FileWriter writer = new FileWriter("c:/demo/names.txt",true); //creating writer object in append mode
			BufferedWriter bwr = new BufferedWriter(writer);  

			bwr.write("James"); 
			bwr.write("\n"); // bwr.newLine();
			bwr.write("Hobert"); 
			bwr.close(); 

			System.out.println("succesfully written to a file"); } 
			catch (IOException ioe) { 
			ioe.printStackTrace(); 

			}
			 }

}



	
