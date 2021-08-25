package com.jbk.myapp.practice;
//import java.lang.*;

import java.util.Scanner;

public class StaticTest {
	
	public static void main(String[] args) {
		StaticEx obj = new StaticEx("Shanin",24);
		obj.doExam();
		obj.doNotice();
		StaticEx.doNotice();
		
	}
}
