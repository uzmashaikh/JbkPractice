package com.jbk.myapp.staticfinal;

public class VaribleDemo {
	static int count=0;
	
	void inc() {
	count++;
	}
	public static void main(String[] args) {
	
		VaribleDemo obj = new VaribleDemo();
		VaribleDemo obj1 = new VaribleDemo();
		obj.inc();
		obj1.inc();
		System.out.println(obj.count);
		System.out.println(obj1.count);

		
	}	
	
	


}
