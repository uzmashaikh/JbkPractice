package com.jbk.myapp.thread;

public class SampleJob implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<50;i++)
		{
			if(i%5==0)
				System.out.println(i+Thread.currentThread().getName());
		}
		
	}

}
