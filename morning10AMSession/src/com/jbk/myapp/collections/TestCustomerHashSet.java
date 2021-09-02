package com.jbk.myapp.collections;
import java.util.*;
public class TestCustomerHashSet {
	public static void main(String[] args) {
		
		HashSet<Customer> hset = new HashSet<Customer>();
		
		Customer c1 = new Customer(104, "Amit", "Mumbai");
		Customer c2= new Customer(101, "Amitab", "Pune");
		Customer c3=new Customer(102, "Abhishek", "Pune");
		Customer c4=new Customer(103, "Aishwarya", "Pune");
		Customer c5=null;
		Customer c7=null;
	
		hset.add(c1);
		hset.add(c2);
		hset.add(c3);
		hset.add(c4);
		hset.add(c5);
		System.out.println(hset.size());
		
		
		hset.forEach(s->{System.out.println(s);});
		
		Customer c6 = new Customer(105, "dulpcatetest", "duplicattest");
		hset.add(c6);
		System.out.println("====");
		hset.add(c6);//adding duplicate element
		hset.forEach(s->{
			System.out.println("=========");
			System.out.println(s);
		});
		
		
		
	}
	
	
}
