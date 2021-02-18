package com.valuemomentum.training.exceptionhandling;
import java.util.*;

//java program to demonstrate user defined function 
//this program throws an exception whenever balance amount is below 1000rs
public class MyException  extends Exception{

	
	
	    //store account information
	
    private static int accno[] = {1001, 1002, 1003, 1004};
 
    private static String name[] =
                 {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
 
    private static double bal[] =
         {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
 
	    MyException()
	    {
	    	
	    }

	    MyException(String str)
	    {
	    	super(str);
	    }
	    public static void main(String[] args) {
	    	try {
	    		System.out.println("accno" + "\t" + "customer"+ "\t" + "Balance");
	    		
	    		for(int i=0;i<5;i++)
	    		{
	    			System.out.println(accno[i] + "\t" +name[i] + "\t" +bal[i]);
	    			if(bal[i]<1000)
	    			{
	    				MyException me=new MyException("Balance is less than 1000");
	    				throw me;
	    			}
	    		}
	    	}//end of try
	    catch(MyException e)
	    	{
	    	e.printStackTrace();
	    	}
	}

}
