package com.jbk.myapp.collections;
import java.util.*;
public class TestSstudent {
	public static void main(String[] args) {
		
		LinkedList<StudentLinkedList> llist = new LinkedList<StudentLinkedList>();
		
		llist.add(new StudentLinkedList(101, "Uzma", "ME",95.0f));
		
		llist.add(new StudentLinkedList(105, "Rohini", "ME",95.0f));
		llist.add(new StudentLinkedList(102, "Shweta", "ME",38.0f));
		llist.add(new StudentLinkedList(103, "Prutha", "ME",45.0f));
		llist.add(new StudentLinkedList(104, "Aparti", "ME",98.0f));
		
		System.out.println(llist.size());
		
		System.out.println("========");
		
		llist.forEach(s->System.out.println(s));
		
		Iterator<StudentLinkedList> itr=llist.iterator();
		while(itr.hasNext()) {
			System.err.println(itr.next());
		}
		System.out.println("=======");
		
		ListIterator<StudentLinkedList> litr=llist.listIterator();
		
		while(itr.hasNext()){
			System.err.println(litr.next());
		}
			
		
		while(litr.hasPrevious())
		{
			System.out.println("previous....");
			System.out.println(litr.previous());
			System.out.println("=====");
			
		}
		
		
	}

}
