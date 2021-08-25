package com.jbk.myapp.inheritance;

public class B extends A {
	void m2() {
		System.out.println("Child m2");
	}
	public static void main(String[] args) {
		B obj =  new B();
		obj.m1();
		obj.m2();
		
	}
}
