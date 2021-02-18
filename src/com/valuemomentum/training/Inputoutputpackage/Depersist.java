package com.valuemomentum.training.Inputoutputpackage;
import java.io.*;
public class Depersist {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/demo/g1.txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();
		

	}

}
