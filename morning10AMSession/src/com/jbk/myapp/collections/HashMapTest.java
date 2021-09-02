package com.jbk.myapp.collections;
import java.util.*;


public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Uzma");
		hm.put(102, "Mulla");
		hm.put(103, "Danish");
		hm.put(104, "Nova");
		hm.put(105, "PD");
		hm.put(null, null);
		hm.put(106, null);
		hm.put(107, null);
		hm.put(null, null);
		hm.put(115, "PD");
		hm.put(129, "PD");
		hm.put(108, "PD");

		

		hm.put(101, "Golu");
		
		hm.forEach(
				(K,V)-> System.out.println(K+" "+V)
				);
		
		System.out.println("HashMap:"+hm);
		Set<Map.Entry<Integer,String>> entries=hm.entrySet();
		
		for(Map.Entry<Integer, String> ent:entries)
		{
			System.out.println("key::"+ent.getKey()+" Value::"+ent.getValue());
		}
			
		


		
	}

}
