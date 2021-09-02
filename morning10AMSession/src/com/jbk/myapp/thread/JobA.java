package com.jbk.myapp.thread;

public class JobA extends Thread{

	@Override
	public void run() {
		for(int i=0;i<200;i++)
		{
			if(i%2==0)
				
				System.out.println(i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
	}
}


