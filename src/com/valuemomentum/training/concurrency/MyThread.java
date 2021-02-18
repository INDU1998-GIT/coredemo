package com.valuemomentum.training.concurrency;

public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread objex=new MyThread();
		objex.create();
		System.out.println("this is the main thread");

	}

	public void create() {
		// when u execute a thread program,there always be a main thread
		Thread objth=new Thread(this);
		objth.start();
	}



public void run()
{
	while(true)
	{
		try
		{
			System.out.println("this is the child thread");
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			
		}
}
}
}