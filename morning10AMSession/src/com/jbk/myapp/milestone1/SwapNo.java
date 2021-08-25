package com.jbk.myapp.milestone1;

public class SwapNo {
	
	int no1=10;
	int no2= 20;
	
	int a=6;
	int b=4;
	
	void swap()
	{
		int temp=0;
		temp=no1;
		no1=no2;
		no2=temp;
	}
	
	void swapWithoutthirdVar()
	{	
		a=a+b;
		b=a-b;
		a=a-b;
		
	}

	public static void main(String[] args) {
		
		SwapNo obj= new SwapNo();
		System.out.println("Before swap:");
		System.out.println("No 1 is="+obj.no1);
		System.out.println("No 2 is="+obj.no2);
		obj.swap();
		System.out.println("After swap:");
		System.out.println("No 1 is="+obj.no1);
		System.out.println("No 2 is="+obj.no2);
		
		obj.swapWithoutthirdVar();
		System.out.println("After swap:");
		System.out.println("No 1 is="+obj.a);
		System.out.println("No 2 is="+obj.b);
		
		
	}

}
