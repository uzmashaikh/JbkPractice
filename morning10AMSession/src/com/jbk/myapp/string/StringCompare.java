package com.jbk.myapp.string;
import java.util.*;


public class StringCompare {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";//s1<s2 since and i has difference of 4 output is -4
			
		System.out.println(str1.compareTo(str2));
		
		String str3="ABD";
		String str4="ABA";//s1<s2 since and i has difference of 4 output is -4
			
		System.out.println(str3.compareTo(str4));
		
		String str5="ABD";
		String str6="";
		
		System.out.println(str5.isEmpty());
		System.out.println(str6.isEmpty());

			
		System.out.println("Lower Case:"+str5.toLowerCase());
		System.out.println("Upper Case:"+str1.toUpperCase());
		
		System.out.println(str1.contains("He"));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.equals(str2));
		
		
		System.out.println("EMpty string replaceto:");
		System.out.println(str6.replace("", "sdfffd"));
		
	}
}
