package com.jbk.myapp.thread;

public class JobY implements Runnable {
	
	SynchronizedEx obj;
	public JobY(SynchronizedEx obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.m2();
		
	}
}
