package com.jbk.myapp.milestone3.array;

public class ArrayDemo {
		
	public static void main(String[] args) {
		int a[] =new int[5];
		a[0]=20;
		a[1]=64;
		a[2]=24;
		a[3]=26;
		a[4]=30;
		System.out.println("Array data usig dynamic initialization");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(+a[i]+" ");
		}
		
		int b[] = {20,30,54,89,23};
		
		System.out.println("Array data uing static initialization");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(+b[i]+" ");
		}
	}
}
	
