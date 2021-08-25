package com.jbk.myapp.Exception;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=null;
		Student s2 = new Student(101,"Rupa");
		
		try
		{
			System.out.println(s2.toString());
			System.out.println(s1.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception caugth");
			e.printStackTrace();
		}
		System.err.println("byeeee");
	}
}
