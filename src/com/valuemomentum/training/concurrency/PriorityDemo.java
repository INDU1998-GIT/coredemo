package com.valuemomentum.training.concurrency;

public class PriorityDemo extends Thread{

	 public void run(){

	     System.out.println("Running thread is "+Thread.currentThread().getName());
	     System.out.println("Running thread priority is "+Thread.currentThread().getPriority());
	  }

	public static void main(String args[]){

	   PriorityDemo t1 = new PriorityDemo();
	  PriorityDemo t2 = new PriorityDemo();
	   PriorityDemo t3 = new PriorityDemo();

	   t1.setPriority(Thread.MIN_PRIORITY); 
	   t2.setPriority(Thread.MAX_PRIORITY);
	   t3.setPriority(Thread.NORM_PRIORITY);

	   t1.setName("Raj on Java");
	   t2.setName("Raj JavaServices");
	   t3.setName("testingjava.com");
	   t1.start();
	   t2.start();
	   t3.start();
	 }
	} 
