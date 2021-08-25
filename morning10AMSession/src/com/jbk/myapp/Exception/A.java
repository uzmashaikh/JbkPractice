package com.jbk.myapp.Exception;

public class A {

	void m1()throws ClassNotFoundException 
	{
		
			System.out.println("m1");
			Class.forName("com.jbk.myapp.Exception.adc");
	}
}
