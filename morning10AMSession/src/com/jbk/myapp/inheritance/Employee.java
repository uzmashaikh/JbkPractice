package com.jbk.myapp.inheritance;

public class Employee extends User {
	String specialization;
	
	
	public Employee(String name,int adharno,int age,String specialization)
	{
		super(name,adharno,age);
		this.specialization=specialization;
	}
	
	public	String toString()
	{
		return name+"\n"+adharno+"\n"+age+"\n"+specialization;	}
	
}
