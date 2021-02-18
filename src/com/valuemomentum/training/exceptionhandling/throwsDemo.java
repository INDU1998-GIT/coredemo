package com.valuemomentum.training.exceptionhandling;
import java.util.*;

public class throwsDemo {
void Division() throws ArithmeticException
{
	int a=45,b=0,rs;
	rs=a/b;
	System.out.println("\n\t the result is"+rs);
}
	public static void main(String[] args) {
		throwsDemo t=new throwsDemo();
		try {
			t.Division();
		}
catch(ArithmeticException Ex)
		{
	System.out.print("\n\tError:" +Ex.getMessage());
		}
		System.out.println("\n\tend of program.");
	}

}
