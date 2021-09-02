package com.jbk.myapp.collections;
import java.util.*;
public class StackEx implements RandomAccess {
public static void main(String[] args) {
	
	Stack<String> stk = new Stack<String>();
	stk.push("Ankush");
	stk.push("meera");
	stk.push("Uzma");

	stk.push("aanad");
	
	System.out.println("====");
	stk.pop();
	stk.pop();
	stk.push("jessi");
	stk.push("Ronoldo");
	
	System.out.println("====");
	String top =stk.peek();
	System.out.println("top:.............."+top);

	//to check if stck is empty
	boolean status =stk.empty();
	System.out.println(status);
	
	
	//check size
	System.out.println(stk.size());
	
	//to search
	int find = stk.search("Ankush");
	System.out.println(find);
	
	Iterator<String> itr = stk.iterator();	
	while(itr.hasNext())
	System.out.println(itr.next());
	
	
		

}
}
