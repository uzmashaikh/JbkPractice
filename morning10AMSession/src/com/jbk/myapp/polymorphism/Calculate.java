package com.jbk.myapp.polymorphism;

public class Calculate {
	void sum(int a,int b)
	{
		System.out.println("sum int is" +(a+b));
	}
	void sum(double a, double b)
	{
		System.out.println("sum of double is" +(a+b));

	}
	
	public static void main(String[] args) {
		Calculate obj = new Calculate();
		obj.sum(20, 96);
		obj.sum(52.2, 65.2);
	}
}
