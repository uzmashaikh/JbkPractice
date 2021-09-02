package com.jbk.myapp.collections;

import java.util.*; 

class VectorEx{      
	public static void main(String args[]){  
		
		Vector<String> v=new Vector<String>();//creating vector  
		v.add("umesh");//method of Collection  
		v.add("irfan");//method of Vector  
		v.add("kumar"); 
		v.add("Shalaka");
		
		//traversing elements using Enumeration  
		Enumeration e=v.elements();  
		while(e.hasMoreElements()){  
			System.out.println(e.nextElement()); 
		}
		System.out.println("====");
		//v.remove("irfan");
		System.out.println("Vector after removing element");
		System.out.println(v);
		
		System.out.println("======");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		
		System.out.println("====");
		System.out.println(v.contains("irfan"));
		System.out.println(v.indexOf("kumar"));
		
	}      
	
}      

