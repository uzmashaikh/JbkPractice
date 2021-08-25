package com.jbk.myapp.constructor;

public class Chaining {
	
	public Chaining()
	{
		System.out.println("Defaut constructor");
	}
	public Chaining(String str)
	{
		this();
		System.out.println("Parameterized constructor with one parameter");
	}
	public Chaining(String str,int num)
	{
		this("Hello");
		System.err.println("Parameterized constructor with two parameter");
	}
	
	public Chaining(int num1,int num2,int num3)
	{
		this("Hello",2);
		System.err.println("Parameterized constructor with three parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chaining obj = new Chaining(5,10,15);
	}

}
