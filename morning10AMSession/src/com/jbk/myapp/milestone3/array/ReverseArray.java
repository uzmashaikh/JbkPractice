package com.jbk.myapp.milestone3.array;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th no of aelements in array");
		n=sc.nextInt();
		
		int arr[] =new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Reverse Array");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
		sc.close();

	
	}
}
