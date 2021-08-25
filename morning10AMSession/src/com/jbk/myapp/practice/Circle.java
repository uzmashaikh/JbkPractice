package com.jbk.myapp.practice;

public class Circle extends Shape {
	
	void calArea()
	{
		double radius=4.5;
		
		double area =0.0;
			area=	((Math.PI)*radius*radius);
		System.out.println("from child Circle class");
		System.out.println("Area is"+area);

		
	}
}
