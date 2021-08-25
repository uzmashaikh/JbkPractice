package com.jbk.myapp.Exception;

public class MulticatchBlock {
	public static void main(String[] args)  {
		
		int a=10;
		int b= 0;
		int res=0;
		int arr[]= {20,21,5,32};
		
		try
		{
			res=a/b;
			System.out.println(res);
			System.out.println(""+arr[20]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caugth...");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index excception");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
