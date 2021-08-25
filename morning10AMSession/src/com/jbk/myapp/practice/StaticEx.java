package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class StaticEx {
	
	String name;
	int age;
	static String notice="Exam delyaed....";
	
	
	StaticEx(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void doExam() {
		System.out.println("Is giving exam"+name);
		System.out.println("give notice"+notice);
		doNotice();
	}
	
	static void doNotice()
	{
		System.out.println(notice);
		StaticEx.setppaer();
	}
	
	static void setppaer()
	{
		System.out.println("Set papaer");
	}
	static
	{
		System.out.println("This is static block");
	}
}
