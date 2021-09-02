package com.jbk.myapp.collections;
import java.util.*;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> arr =new ArrayList<String>();
		arr.add("1st");
		arr.add("2nd");
		arr.add("3rd");
		
		List<String> list= new ArrayList<>();
		
		list.add("2nd");
		//list.add("random");
		
		System.out.println("Does array list contains all elements" +arr.containsAll(list));
		list.add("1st");
		list.add("3rd");
		System.out.println("Does array list contains all elements" +arr.containsAll(list));
		
		String[] str = new String[arr.size()];
		arr.toArray(str);
		for(String s1:str)
		{
			System.out.println(s1);
		}
		
	}

}
