package com.jbk.myapp.thread;

public class JobC extends Thread{

	@Override
	public void run() {
		boolean b=true;

		while(b) {
			try {
				Thread.currentThread().sleep(1000);
				System.out.println("Helloo");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}

