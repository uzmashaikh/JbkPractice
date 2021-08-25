package com.jbk.myapp.string;
import java.util.*;

public class StringConcat {
	public static void main(String[] args) {
		String str1,str2,str3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		str1=sc.nextLine();
		
		System.out.println("Enter String2");
		str2=sc.nextLine();
		
		str3=str1+str2;
		
		System.out.println("String concat"+str3);
		
		
		System.out.println("Using inbuild method");
		
		str3=str1.concat(str2);
		
		System.out.println("String concat"+str3);
		
		System.out.println("striing length");
		System.out.println(str3.length());
		
		System.out.println("Comparinggg....");
		
		System.out.println(str1.compareTo(str2));
		
		
		
		
	}
}
