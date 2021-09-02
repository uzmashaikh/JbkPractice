package com.jbk.myapp.collections;

public class EmployeeArrayList {
	
	private int id;
	private String name;
	private String dept;
	private float salary;
	
	EmployeeArrayList(int id, String name,String dept, float salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

	

}
