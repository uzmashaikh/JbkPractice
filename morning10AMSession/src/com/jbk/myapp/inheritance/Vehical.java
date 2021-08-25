package com.jbk.myapp.inheritance;

public class Vehical {
	
	String color;
	private int speed;
	private int size;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Vehical(String color, int speed, int size) {
		super();
		this.color = color;
		this.speed = speed;
		this.size = size;
	}
	
	public String toString()
	{
		return color+"\n"+speed+"\n"+size+"\n"+color+"\n"+speed+"\n"+size;
	}
	
}
