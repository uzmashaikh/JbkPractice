package com.jbk.myapp.test2;
import com.jbk.myapp.inheritance.*;

public class Square extends Shape {
	
	public Square(int sside)
	{
		sides=sside;
	}
	
	void display() {
		Shape obj = new Shape();
		Square obj2 =new Square(12);
		//System.out.println(obj.sides);
		System.out.println(obj2.sides);

	}
}
