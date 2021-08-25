package com.jbk.myapp.practice;

public class Square extends Shape {
	
	void calArea()
	{
		double side=4.5;
		
		double area = side*side;
		System.out.println("from child class");
		System.out.println("Area is"+area);

		
	}
}
