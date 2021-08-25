package com.jbk.myapp.practice;

public class StringCopy {
	
	public static void main(String[] args) {
		String str1="abc";
		
		String str2="qwe";
		
		String temp;
		
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println(str1);
		System.out.println(str2);
	}
}

