package com.jbk.myapp.collections;

public class Customer {
	private int cid;
	private String name;
	private String location;
	public Customer(int cid, String name, String location) {
		super();
		this.cid = cid;
		this.name = name;
		this.location = location;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", location=" + location + "]";
	}



}
