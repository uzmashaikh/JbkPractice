package com.jbk.myapp.collections;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EmployeeArrayList> alist = new ArrayList<EmployeeArrayList>();
		EmployeeArrayList e1 = new EmployeeArrayList(101, "priya", "Sales", 1000000);
		EmployeeArrayList e2 = new EmployeeArrayList(102, "darshit", "IT", 2000000);
		EmployeeArrayList e3 = new EmployeeArrayList(103, "amit", "Sales", 520000);
		EmployeeArrayList e4 = new EmployeeArrayList(104, "shalaka", "Marketing", 55566666);
		EmployeeArrayList e5 = new EmployeeArrayList(105, "madhura", "Mang", 3666222);
		
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		alist.add(e5);
		
		System.out.println(alist.size());
		System.out.println("===========1st way=========");
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		
		System.out.println("===========2nd way=========");
		for(EmployeeArrayList e:alist)
		{
			System.out.println(e);
		}
		
		System.out.println("===========3rd way=========");
		
		alist.forEach(e->System.out.println(e));
		
		Iterator<EmployeeArrayList> itr =alist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
