package com.jbk.myapp.constructor;

public class ConstOverloading {	
	int value1=55;
	int value2=62;

	public ConstOverloading() {
		System.out.println("Default constructor");

	}

	public ConstOverloading(int a ) {
		value1=a;
	}
	public ConstOverloading(int a,int b) {
		value1=a;
		value2=b;
	}
	void display()
	{
		System.out.println("A:"+value1);
		System.out.println("B:"+value2);
	}

	public static void main(String[] args) {

		ConstOverloading obj1 = new ConstOverloading();
		ConstOverloading obj2 = new ConstOverloading(100);

		ConstOverloading obj3 = new ConstOverloading(200,300);

		obj1.display();
		obj2.display();
		obj3.display();




	}
}

