package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class Tables {

	void test()
	{
		int input;
		System.out.println("Enter data to show table");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		
		for(int i =1; i <= 10; i++)
		{
			System.out.println(input+"X"+i+"="+i*input);
		}



	}
	public static void main(String[] args) {
		Tables obj = new Tables();
		obj.test();
	}
}
