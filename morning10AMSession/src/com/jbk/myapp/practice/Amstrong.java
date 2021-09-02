package com.jbk.myapp.practice;

import java.util.Scanner;

public class Amstrong {
	
	public static void main(String[] args) {
		int a,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check armstrong");
		int num=sc.nextInt();
		 
		int temp=num;
		
		while(num>0)
		{
			a=num%10;
			num=num/10;
			res=res+(a*a*a);
			
		}
		if(temp==res)
			System.out.println("Armstrong");
		else
			System.out.println("Not");
			
	}
}
