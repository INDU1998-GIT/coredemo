package com.valuemomentum.training.Inputoutputpackage;
import java.io.*;
public class Persist {

	public static void main(String[] args) throws Exception{
		
Student s1=new Student(101,"Raj");
FileOutputStream fout=new FileOutputStream("c:/demo/g1.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
System.out.println("success");
	}

}
