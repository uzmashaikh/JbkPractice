package com.jbk.myapp.collections;

public class StudentComparable implements Comparable<StudentComparable>{
	 int rollno;
	 String name;
	 String course;
	 float percentage;
	static final String collagename="PCCOE";
	public StudentComparable(int rollno, String name, String course, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.percentage = percentage;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public static String getCollagename() {
		return collagename;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", percentage=" + percentage
				+ "]";
	}

	
	@Override
	public int compareTo(StudentComparable o) {
		// TODO Auto-generated method stub
		if(this.rollno==o.rollno)
		{
			return 0;
		}
		else if(o.rollno>this.rollno)
		{
			return 1;
		}
		else return -1;
	}
	
	
	
	
}
