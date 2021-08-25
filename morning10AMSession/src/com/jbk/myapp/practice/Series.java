package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class Series {

	void fun()
	{
	for (int i =10;i<=100;i=i+10 ) {
		System.out.print(" "+i);
	}
	for (int i =1;i<=28;i=i+3 ) {
		System.out.print(" "+i);
	}
	
	
	}
	
	public static void main(String[] args) {
		Series obj = new Series();
		obj.fun();
	}
}
