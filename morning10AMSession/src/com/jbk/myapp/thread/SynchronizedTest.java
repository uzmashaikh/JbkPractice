package com.jbk.myapp.thread;


public class SynchronizedTest {
	public static void main(String[] args) {
		SynchronizedEx t1 =new SynchronizedEx();
		
		JobX x =new  JobX(t1);
		JobY y =new  JobY(t1);
		
		Thread tx =new Thread(x);
		Thread ty = new Thread(y);
		
		
		tx.setName("tx");ty.setName("ty");
		tx.setPriority(1);//setting prioprity....
		ty.setPriority(10);
		tx.start();
		ty.start();
		
		
	}
	
}
