package com.jbk.myapp.abstraction;

public  class  AbstractSubclassEx3 extends AbstractclassEx3 {
	
	String name;
	int age;
	String city,country;

	@Override
	void getCity(String city) {
		// TODO Auto-generated method stub
		this.city=city;
		
	}

	@Override
	void getCountry(String country) {
		// TODO Auto-generated method stub
		this.country=country;
	}
	
	void getName(String name) {
		this.name=name;
	}
	
	void getage(int age) {
		this.age=age;
	}
	
	
	public void display()
	{
	System.out.println("Name"+name);
	System.out.println("Age"+age);
	System.out.println("City"+city);
	System.out.println("Country"+country);



		
	}
	
}
