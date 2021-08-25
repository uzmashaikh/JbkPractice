package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class InterfaceStaticTest implements InterfaceStatic {

	
	
	public void m1() {
		InterfaceStatic.getCountry();
		System.out.println("geeting static data....");
	}
	
	public static void main(String[] args) {
		InterfaceStaticTest obj = new InterfaceStaticTest();
		obj.m1();
	}
}

