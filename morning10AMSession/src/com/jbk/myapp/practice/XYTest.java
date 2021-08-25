package com.jbk.myapp.practice;

public class XYTest {
	
	public static void main(String[] args) {
		
		Y objy = new Y();
		objy.m1();
		objy.m2();
		objy.m3();
		System.out.println(objy.a);
		System.out.println(objy.b);
		System.out.println(objy.c);
		
		X objx = new Y();
		objx.m1();
		objx.m2();
		//objx.m3();
		System.out.println(objx.a);
		//System.out.println(objx.b);
		System.out.println(objx.c);
		System.out.println();
		
		
		
	}
	
	

}
