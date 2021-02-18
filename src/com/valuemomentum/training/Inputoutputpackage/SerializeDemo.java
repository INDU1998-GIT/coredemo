package com.valuemomentum.training.Inputoutputpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Michael khan";
		emp.address="castle street,warangal";
		emp.SSN=111122333;
		emp.number=101;
		try {
			FileOutputStream fileout=new FileOutputStream("c:/demo/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(emp);
			out.close();
			fileout.close();
			System.out.println("serialized data is saved in c:/demo/employee.ser");
		
		}
catch(IOException e)
		{
	e.printStackTrace();
		}
	}

}
