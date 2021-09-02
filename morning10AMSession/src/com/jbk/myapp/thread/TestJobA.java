package com.jbk.myapp.thread;

public class TestJobA {

	public static void main(String[] args) {
		JobA t1 =new JobA();
		JobB t2 =new JobB();
		JobC t3 =new JobC();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t31");

		t3.start();
		t1.start();
		t2.start();
		
	}
}
