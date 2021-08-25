package com.jbk.myapp.inheritance;

public class User {
	String name;
	int adharno;
	int age;
	
	public User(String name,int adharno,int age)
	{
		this.name=name;
		this.adharno=adharno;
		this.age=age;
	}
	public	String toString()
	{
		return name+"\n"+adharno+"\n"+age;
	}

}
