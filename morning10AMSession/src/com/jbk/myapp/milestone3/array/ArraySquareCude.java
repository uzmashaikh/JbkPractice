package com.jbk.myapp.milestone3.array;

import java.util.Arrays;

public class ArraySquareCude {
		
	public static void main(String[] args) {
		int a[] = {10,20,30,4,7};
		int b[] = new int[a.length];
		
		int res=1;
		System.out.println("Sqaure....");
		for(int i=0;i<a.length;i++)
		{	
			res=a[i]*a[i];
			System.out.println(res);
			
			System.out.println("Sqaure..."+Math.pow(a[i], 2));
		}
		System.out.println("Cube....");
		for(int i=0;i<a.length;i++)
		{	
			res=a[i]*a[i]*a[i];
			System.out.println(res);
			
			System.out.println("Cube..."+Math.pow(a[i], 3));

		}
		
		System.out.println("Copying....");
		for(int i=0;i<a.length;i++)
		{	
			b[i]=a[i];
			
		}
		System.out.println("Array A:"+Arrays.toString(a));
		System.err.println("After copy...");
		System.out.println("Array B:"+Arrays.toString(b));

		
	}
}
	
