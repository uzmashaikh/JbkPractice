package com.jbk.myapp.practice;

public class StringPrac {
	
	
	public static void main(String args[])
	{
		String s1= "JavabyKiran";
		String s2="Karvenagar";
		String s3 = "helloo";
		
		System.out.println("Charat 3rd index is  "+s1.charAt(3));
		System.out.println("Check two strings are wqual or not"+s1.equals(s3));
		System.out.println("Concat..."+s1.concat(s2));
		System.out.println("Subdtring of s1...."+s1.substring(4,11));
		System.out.println("To lower.."+s1.toLowerCase());
  		System.out.println("To upper..."+s2.toUpperCase());
	}
}
