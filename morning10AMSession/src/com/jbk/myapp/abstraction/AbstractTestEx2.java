package com.jbk.myapp.abstraction;

public class  AbstractTestEx2 extends AbstractclassEx2 {
	int x,y,z;
	@Override
	void get(int a, int b) {
		// TODO Auto-generated method stub
		x=a;
		y=b;
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		z=x+y;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Addition is.... "+z);
	}
	
	public static void main(String[] args) {
		AbstractTestEx2 obj= new AbstractTestEx2();
		obj.get(023, 85);
		obj.display();
		obj.add();
		obj.display();
	}
	
	
}
