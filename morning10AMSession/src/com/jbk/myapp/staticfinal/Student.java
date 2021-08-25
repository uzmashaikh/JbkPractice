package com.jbk.myapp.staticfinal;

public class Student {
	int a;
	static int b;
	public Student() {
		// TODO Auto-generated constructor stub
		b++;
	}
	 void show() {
		System.out.println(a);
		System.out.println(b);
	}
	static void showdata()
	{
		System.out.println("parent===ssc");
	
	}
	
}
