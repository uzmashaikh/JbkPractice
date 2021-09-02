
package com.jbk.myapp.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("C");
		alist.add("C++");
		alist.add("peral");
		alist.add("java");
		alist.add("PHP");
		alist.add(null);
		alist.add(null);
		


		//Iterating using iterator()
		Iterator<String> itr =alist.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		//get elements by index

		System.out.println(alist.get(3));

		//conatins() method
		
		System.out.println(alist.contains("C"));
		System.out.println(alist.contains("C++"));
		System.out.println(alist.contains("Hello"));

		//add elements to specific index
		alist.add(4, "JavaScript");

		//check if list is empty
		System.out.println(alist.isEmpty());

		//check index of element
		System.out.println(alist.indexOf("Java"));

		//check size of list
		System.out.println(alist.size());
		
		//iterating through lambda xpresion
		
		alist.forEach((s)->{System.out.println(s);});



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
true
true
false
false
-1
8
C
C++
peral
java
JavaScript
PHP
null
null

ArrayList :
1.Underline Data Structure: Resizeable Array
2.Insertion order is preserved
3.Duplicates are allowed
4.Multiple Null insertion are allowed.
5.Hetrogenous objects are allowed.
6.Implements RandomAccess Interface
7.Methods: add(), addAll(),clear(),contains(), isEmpety(). indexOf()
	


*/