package com.jbk.myapp.Exception;

public class C {

	void m3()throws ClassNotFoundException 
	{
		B objb=new B();
		objb.m2();

		System.out.println("m3");
	}
}

