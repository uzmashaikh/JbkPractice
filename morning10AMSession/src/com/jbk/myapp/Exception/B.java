package com.jbk.myapp.Exception;

public class B {

	void m2()throws ClassNotFoundException  
	{
		A obja=new A();
		obja.m1();
		
		System.out.println("m2");
	}
}
