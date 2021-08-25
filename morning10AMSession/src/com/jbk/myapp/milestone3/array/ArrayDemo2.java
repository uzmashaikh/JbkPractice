package com.jbk.myapp.milestone3.array;
import java.util.*;
public class ArrayDemo2 {
		
	public static void main(String[] args) {
		int a[] =new int[5];
		int largest=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Finding largets....");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
			{
				largest=a[i];
			}
		}
		System.out.println("Largest element is"+largest);
	}
}
	
