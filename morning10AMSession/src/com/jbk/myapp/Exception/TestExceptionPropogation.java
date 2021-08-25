package com.jbk.myapp.Exception;

public class TestExceptionPropogation {
	public static void main(String[] args)throws ClassNotFoundException  {
		C objc =new C();
		objc.m3();
		System.out.println("Main exit");
	}
}
