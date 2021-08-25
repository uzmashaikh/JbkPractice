package com.jbk.myapp.abstraction;

public class  MovableEx implements InterfaceMaoveable{
	public boolean isMovable() {
		
		System.out.println("Min speed"+minspeed);
		return true;
	}
	
	public static void main(String[] args) {
		MovableEx obj = new MovableEx();
		System.out.println(obj.isMovable());
	}
}
