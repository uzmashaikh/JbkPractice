package com.jbk.myapp.constructor;

public class C {
	
	int c=20;
	public C()
	{
		c=40;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		C obj = new C();
	}
}
