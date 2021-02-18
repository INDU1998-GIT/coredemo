package com.valuemomentum.training.exceptionhandling;
import java.util.*;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("JamesGosling"); //allocate a space of extra 16 characters
		int l=str.length();
		System.out.println("the length of the string is:"+l);
		System.out.println("the capacity of string is:"+str.capacity());   //28=12+16 (capacity=size of string+16 characters)
	System.out.println("the substring is:" +str.substring(0, 5));

	str.replace(5,10,"Java");
	System.out.println(str);
	str.delete(2, 5);
	System.out.println(str);
	System.out.println("the reverse of string is:"+str.reverse());
	
	}
}