package com.jbk.myapp.string;
import java.util.*;


public class StringEqualsAndRefComparison {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";//s1<s2 since and i has difference of 4 output is -4
		
		String str3 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));



	}
}
