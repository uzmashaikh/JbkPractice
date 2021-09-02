package com.jbk.myapp.collections;
import java.util.*;
public class TestStudentComparable {
	public static void main(String[] args) {
		
		ArrayList<StudentComparable> llist = new ArrayList<StudentComparable>();
		
		llist.add(new StudentComparable(101, "Uzma", "ME",95.0f));
		
		llist.add(new StudentComparable(105, "Rohini", "ME",95.0f));
		llist.add(new StudentComparable(102, "Shweta", "ME",38.0f));
		llist.add(new StudentComparable(103, "Prutha", "ME",45.0f));
		llist.add(new StudentComparable(104, "Aparti", "ME",98.0f));
		
		System.out.println(llist.size());
		
		Collections.sort(llist);
		llist.forEach(s->System.out.println(s));
		
		System.out.println("======");
		
		for(StudentComparable comp: llist)
		{
			System.out.println(comp.rollno+" "+comp.name+" "+comp.course+" "+comp.percentage+" ");
		}
		
		
	
	
		
		
	}

}
