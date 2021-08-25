package com.jbk.myapp.polymorphism;

public class BindDynamicSubclass  extends BindDynamic{
	
//public void display(String str) {
		
		/*if(val==null)
		{
		
			val="Derived class function".concat(str);
			System.out.println(val);
		}*/
	public void display(String str) {
		super.display(str);
		if (val == null) {
		str = "Derived Class Fuction ".concat(str);
		System.out.println(str);
		}
		}

	}

