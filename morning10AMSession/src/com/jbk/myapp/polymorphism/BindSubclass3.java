package com.jbk.myapp.polymorphism;

public class BindSubclass3  extends BindSubclass2{

	void display()
	{
		super.display();
		text="BindSubclass3";
		System.out.println("Function calling"+text);
	}
}

