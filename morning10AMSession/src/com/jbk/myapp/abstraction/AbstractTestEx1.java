package com.jbk.myapp.abstraction;

public abstract class  AbstractTestEx1 extends AbstractclassEx1{

	public void display()
	{
		System.out.println("Overriden abstract method...");
	}
	public static void main(String[] args) {
		AbstractTestEx1 obj = new AbstractTestEx1() {
		};
		obj.display();
		obj.display2();
	}
}
