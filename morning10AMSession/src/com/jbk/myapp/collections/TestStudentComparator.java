package com.jbk.myapp.collections;
import java.util.*;
public class TestStudentComparator {
	public static void main(String[] args) {
		
		ArrayList<StudentComparator> llist = new ArrayList<StudentComparator>();
		
		llist.add(new StudentComparator(101, "Uzma", "ME",95.0f));
		
		llist.add(new StudentComparator(105, "Rohini", "ME",95.0f));
		llist.add(new StudentComparator(102, "Shweta", "ME",38.0f));
		llist.add(new StudentComparator(113, "Prutha", "ME",45.0f));
		llist.add(new StudentComparator(14, "Aparti", "ME",98.0f));
		
		System.out.println(llist.size());
		
		Collections.sort(llist,new RollNoComparator());
		llist.forEach(s->System.out.println(s));
		
		System.out.println("RollnoComparator");
		
		for(StudentComparator comp: llist)
		{
			System.out.println(comp.rollno+" "+comp.name+" "+comp.course+" "+comp.percentage+" ");
		}
		
		Collections.sort(llist,new NameComparator());
		
		System.out.println("NameComparator");
		llist.forEach(s->System.out.println(s));
		
		
	
	
		
		
	}

}
