package com.jbk.myapp.thread;

public class SynchronizedEx {
	
	synchronized void m1()
	{
		System.out.println("M1:class A");
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
	synchronized void m2()
	{
		System.out.println("M2:class A");
		
		for(int i =0;i<20;i++)
		{
			if(i%2!=0)
				System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

}
