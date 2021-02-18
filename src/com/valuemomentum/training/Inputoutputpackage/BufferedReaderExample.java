package com.valuemomentum.training.Inputoutputpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {


		    
			public static void main(String args[])throws Exception{             
			    InputStreamReader r=new InputStreamReader(System.in);     //input stream reader belongs to byte stream
			    BufferedReader br=new BufferedReader(r);            
			    System.out.println("Enter your name and age");    
			    String name=br.readLine();   
			    int age=Integer.parseInt(br.readLine()); //reads in the form of string
			    System.out.println("Welcome "+name + "Age: " + age);    
			}    
			}  

	
