package com.jbk.myapp.practice;

public class SquareTest extends Shape {
	
	public static void main(String[] args) {
		Shape s = new Circle();
		s.calArea();
		System.out.println("====");
		Shape obj = new Shape();
		obj.calArea();
		System.out.println("====");

		Circle c = new Circle();
		c.calArea();
	
	}
}
