package com.jbk.myapp.thread;

public class JobX implements Runnable{
	
	SynchronizedEx obj;
	public JobX(SynchronizedEx obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.m1();
		
	}
	
	
}
