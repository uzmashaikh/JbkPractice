package com.jbk.myapp.staticfinal;

public class StudentTest extends Student {
	
	
		static void showdata() {
		System.out.println("child====");
		}	
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.show();
		Student obj1 = new Student();
		obj1.show();
		showdata();
		Student.showdata();
		
		Student s = new StudentTest();
		s.showdata();
		
	//	this.showdata();
		
		
	}

}
