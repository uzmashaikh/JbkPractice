package com.jbk.myapp.polymorphism;

public class Override {
	
	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.m1();
		
		System.out.println("====");
		DerivedClass obj1 = new DerivedClass();
		obj1.m1();
		
		System.out.println("====");
		BaseClass ref = new DerivedClass();
		ref.m1();
		
//		DerivedClass der = new DerivedClass();
//		der.m1();
//		// method calling from super class object
//		BaseClass base = new BaseClass();
//		base.m1();
//		BaseClass base1 = new DerivedClass();
//		base1.m1();

		
		
	}
}
