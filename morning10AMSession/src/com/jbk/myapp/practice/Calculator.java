package com.jbk.myapp.practice;
import java.util.*;

public class Calculator {

	void check()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers \n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your choice to a) Addition \n b) Subtraction \n c)Multiplication \n d)Division \n");
		
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		switch(ch)
		{
		case 'a':
				System.out.println("Addition is.... "+(a+b));break;
		case 'b':
			System.out.println("Subtraction is.... "+(a-b));break;
		case 'c':
			System.out.println("Multiplicaton is.... "+(a*b));break;
		case 'd':
			System.out.println("Division is.... "+(a/b));break;
		default:
			System.out.println("Enter correct season.....");
		}

	}


	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.check();
	}

}


