package com.jbk.myapp.practice;

public class TestSample {

	public static void main(String[] args) {
		Sample obj = new Sample();
		int hash=obj.hashCode();
		Sample obj1 = new Sample();
		System.out.println(obj.equals(obj));
		System.out.println("hashcode1 is"+hash);
		System.out.println("hashcode1 is"+hash);

		int hash2=obj1.hashCode();
		System.out.println("hashcode 2 is"+hash2);
	}
}
