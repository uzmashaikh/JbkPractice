package com.jbk.myapp.inheritance;

public class Car extends Vehical{
	int CC;
	int gears;
	String color;
	public int getCC() {
		return CC;
	}
	public void setCC(int cC) {
		CC = cC;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Car(String color, int speed, int size, int cC, int gears, String color2) {
		super(color, speed, size);
		this.CC = cC;
		this.gears = gears;
		this.color = color2;
	}
	
	
	

}
