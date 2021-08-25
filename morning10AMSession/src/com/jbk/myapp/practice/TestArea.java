package com.jbk.myapp.practice;

public class TestArea extends Shape {
	
	void calArea()
	{
		double side=0.0;
		
		double area = side*side;
		System.out.println("from child class");
		System.out.println("Area is"+area);

		
	}
}
