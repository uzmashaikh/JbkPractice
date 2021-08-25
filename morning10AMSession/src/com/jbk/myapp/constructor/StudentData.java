package com.jbk.myapp.constructor;

public class StudentData {

	int id;
	String name;
	int  age;
	
	public StudentData()
	{
		System.out.println("Default constructor");
		id=100;
		name="amit";
		age=52;
	}
	
	public StudentData(int id,String name,int age)
	{
		System.out.println("parametrizd constructor");
		this.id = id;
		this.name=name;
		this.age=age;
	}
	

	void setId(int id)
	{
		this.id=id;
	}

	int getID()
	{
		return id;
	}

	void setname(String name)
	{
		this.name=name;
	}

	String getname()
	{
		return name;
	}

	void setage(int age)
	{
		this.age=age;
	}

	int getage()
	{
		return age;
	}

	public static void main(String[] args) {
		StudentData obj = new StudentData();
		System.out.println("Name::"+obj.getname());
		System.out.println("ID::"+obj.getID());
		System.out.println("Age::"+obj.getage());
		
		StudentData obj1 = new StudentData(101,"Sumt",65);
		System.out.println("Name::"+obj1.getname());
		System.out.println("ID::"+obj1.getID());
		System.out.println("Age::"+obj1.getage());
		
	}



}
