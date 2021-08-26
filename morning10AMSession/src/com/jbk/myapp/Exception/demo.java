package com.jbk.myapp.Exception;

public class demo {
	public static void main(String[] args) {
//		int a=10;
//		int b=0;
		try
		{
			int res=450;
			System.out.println(res);
		}
//		catch(Exception e) write code more specific to more general
//		{
//			
//		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught");
		}
		System.out.println("Hi there");
	}
}
