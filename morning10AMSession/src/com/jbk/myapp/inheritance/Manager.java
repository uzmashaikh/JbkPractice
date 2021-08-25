package com.jbk.myapp.inheritance;

public class Manager extends User {
	String department;
	
	
	public Manager(String name,int adharno,int age,String department)
	{
		super(name,adharno,age);
		this.department=department;
	}
	public	String toString()
	{
		return name+"\n"+adharno+"\n"+age+"\n"+department;	}

}
