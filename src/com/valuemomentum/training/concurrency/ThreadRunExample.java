package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable(),"t1-sashi");
		Thread t2=new Thread(new HeavyWorkRunnable(),"t2-indu");
		System.out.println("Starting Runnable threads");
		t1.start(); //invokes run()
		t2.start();
		System.out.println("Runnable thread has been started");
		Thread t3=new MyThread2("t3");
		 Thread t4=new MyThread2("t4");
		 System.out.println("Starting myThreads");
		 t3.start();
		 t4.start();
		 System.out.println("mythreads has been started");

	}

}
