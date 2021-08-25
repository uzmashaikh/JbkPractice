package com.jbk.myapp.milestone3.array;

public class MinMax {
		
	public static void main(String[] args) {
		int a[] = {20,63,45,78,25};
		
		int max=a[0];
		int min=a[0];
		
		for(int i:a) {
			if(max<i)
				max=i;
	
		}
		System.out.println("Max is"+max);
		
		for(int i:a) {
			if(min>i)
				min=i;
	
		}
		System.out.println("Min is"+min);
		
	}
}
	
