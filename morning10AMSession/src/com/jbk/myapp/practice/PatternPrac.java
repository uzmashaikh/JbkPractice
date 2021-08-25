package com.jbk.myapp.practice;

public class PatternPrac {

	public static void main(String[] args) {
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Left digonal");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=i;j++)
			{    
				System.out.print("*");
			}
			System.out.println();
		}
		
		int k = 3;
		for(int i=3;i>=0;i--)
		{
			for(int j=3;j>=0;j--)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
