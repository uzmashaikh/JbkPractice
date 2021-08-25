package com.jbk.myapp.polymorphism;

public class BindDynamic {
	
	protected String val;
	public void display(String str) {
		val="Base class function".concat(str);
		System.out.println(val);
	}
}
