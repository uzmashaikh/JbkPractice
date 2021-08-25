package com.jbk.myapp.abstraction;
import java.util.*;


public class  InterfaceTest1 implements InterfaceEx1,InterfaceEx2 {
	public static void main(String[] args) {
		
		
		InterfaceTest1 obj=new InterfaceTest1();
		obj.m1();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance example......");
		
		
	}
	
	
}
