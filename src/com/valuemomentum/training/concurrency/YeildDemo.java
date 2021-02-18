package com.valuemomentum.training.concurrency;
class MyThread3 extends Thread
{
	public void run()
	{
		 for (int i=0 ;i<5;i++)
	        {
	           System.out.println(Thread.currentThread().getName()+" in control");
	        }
	       
	}
}
	//Driver class
public class YeildDemo {

	public static void main(String[] args) {
		MyThread3 t=new MyThread3();
		t.start();
		for(int i=0;i<5;i++) {
			//control passes to child thread
			Thread.yield();
			//after execution of child thread
			//main thread makes over
			System.out.println(Thread.currentThread().getName()+"in control");
		}
		
	}

}
