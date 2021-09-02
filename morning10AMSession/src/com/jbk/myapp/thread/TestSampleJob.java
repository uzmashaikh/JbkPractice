package com.jbk.myapp.thread;

public class TestSampleJob {

	public static void main(String[] args) {
		SampleJob obj = new SampleJob();
		SampleJob obj1 = new SampleJob();
		
		Thread t1 = new Thread(obj);
		Thread t2= new Thread(obj1);
		
		t1.start();
		t2.start();
	}
}
