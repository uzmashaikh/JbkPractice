package com.jbk.myapp.collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<String>();

		llist.add("C");
		llist.add("C++");
		llist.add("peral");
		llist.add("java");
		llist.add("PHP");
		llist.add(null);
		llist.add(null);



		//Iterating using iterator()
		Iterator<String> itr =llist.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		//get elements by index
		System.out.println(llist.get(3));

		//add elements to start and end  of linkedlist 
		llist.addFirst("1st lement added");

		llist.addLast("element added to last of llinkedlist");

		System.out.println("Lambda empression");
		llist.forEach((s)->{System.out.println(s);});

				
		//getting head and tail of linkedlist
		System.out.println(llist.peekFirst());
		System.out.println(llist.peekLast());


	


			}
}

/*
C
C++
peral
java
PHP
null
null
java
Lambda empression
1st lement added
C
C++
peral
java
PHP
null
null
element added to last of llinkedlist
1st lement added
element added to last of llinkedlist


LinkedList :
1.Underline Data Structure: Doubly-linked list 
2.Insertion order is preserved
3.Duplicates are allowed
4.Multiple Null insertion are allowed.
5.Hetrogenous objects are allowed.
6.Methods: add(), addAll(),addFirst(),addLast(),getFirst(),getLast(),peekFirst(),peekLast()

 */



