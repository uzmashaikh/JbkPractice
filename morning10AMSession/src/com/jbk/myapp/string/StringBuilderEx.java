package com.jbk.myapp.string;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder strb = new StringBuilder("Hello");
		strb.append("World");
		System.out.println(strb);
		
		strb.insert(2, "Hi");
		System.out.println(strb);
		
		strb.insert(10, "Hi");
		System.out.println(strb);
		
		StringBuilder strb1 = new StringBuilder("Hello");
		strb1.replace(1, 3, "world");
		System.out.println(strb1);//Hworldlo
		
		StringBuilder strb2 = new StringBuilder("Hello");
		strb2.delete(1, 4);
		System.out.println(strb2);//Ho
		
		StringBuilder strb3 = new StringBuilder("Hello");
		strb3.reverse();
		System.out.println(strb3);//olleH
		
		
		
	}
	

}
