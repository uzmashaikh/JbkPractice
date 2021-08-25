package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class EvenTest {

	void test()
	{
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println("Even nos");
		for (int i = 1; i<=100 ; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
		
	}
	public static void main(String[] args) {
		EvenTest obj = new EvenTest();
		obj.test();
	}
}
