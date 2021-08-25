package com.jbk.myapp.constructor;

public class SubClass extends SuperClass {
	int x=200;
	void printNo()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	void m1()
	{
		System.out.println("From child class");
	}

	void printm1()
	{
		m1();
		super.m1();
	}

}


