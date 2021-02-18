package com.valuemomentum.training.Inputoutputpackage;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		try
		{
			Reader r=new FileReader("c:/demo/data.txt");
			int data=r.read();
			while(data!=-1) //when stream ends i.e,no data
			{
			System.out.print((char)data);	
			data=r.read();
			}
			r.close();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}

	}

}
