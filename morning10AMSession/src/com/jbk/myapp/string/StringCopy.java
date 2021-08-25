package com.jbk.myapp.string;
import java.util.*;

public class StringCopy {
	public static void main(String[] args) {
		String str1="Hello";
		String str2;
		
		String str3="Mulla";
		String str4="Shab";
		str2=str1;
		System.out.println("Method1");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("Method2");
		String s = new String(str1);
		System.out.println(s);
		
		System.out.println("Method3");
		System.out.println("String3"+str3);
		System.out.println("String4"+str4);

		str4=String.copyValueOf(str3.toCharArray());
		System.out.println("Sting4"+
		str4);
		
//		for(int i = 0;i<str1.length();i++)
//		{
//			str2.charAt(i)=str1.charAt(i);
//		}
		
		
		
		
		
		
	}
}
