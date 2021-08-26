package com.jbk.myapp.Exception;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		
		try
		{
			try {
						System.out.println("Inside 1st block");
					int b = 4/4;
					System.out.println(b);	
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exceptio caught in 1st block");
				e.printStackTrace();
			}
			try
			{
				int a[] = new int[5];
				System.out.println(a[10]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exceptio caught in 2nd block");
				e.printStackTrace();			
			}
		System.out.println("===");	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exceptio caught in 1st block");
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceptio caught in 2nd block");
			e.printStackTrace();			
		}
		catch(Exception e)
		{
			System.out.println("Exceptio caught last");
			e.printStackTrace();	
		}
		
		System.out.println("main exit...");
		
	}
}
