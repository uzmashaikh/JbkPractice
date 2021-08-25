package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class Area {

	double radius;
	Scanner sc = new Scanner(System.in);
	
	void calArea()
	{
		double result;
		System.out.println("Enter Radius to calculate area");
		
		radius = sc.nextDouble();
		
		result = (Math.PI)*(radius*radius);
		System.out.println("The result is"+result);
	}
	
	void cal()
	{	
		System.out.println("Enter x and y to cal maximum value");
		int x= sc.nextInt();
		int y = sc.nextInt();
		int result = Math.max(x, y);
		int result1 = Math.min(x, y);
		
		System.out.println("Max is:"+result);
		System.out.println("Min is:"+result1);
		
		System.out.println("Power is"+Math.pow(x,y));
		System.out.println("Square root o x is"+Math.sqrt(x));
	}
	
	
}
