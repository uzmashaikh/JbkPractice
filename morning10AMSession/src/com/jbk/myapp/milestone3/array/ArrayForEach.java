package com.jbk.myapp.milestone3.array;

public class ArrayForEach {

	public static void main(String[] args) {
		int a[] =new int[5];
		a[0]=20;
		a[1]=64;
		a[2]=24;
		a[3]=26;
		a[4]=30;
		System.out.println("for each====");

		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("fro each====");
		char values[]=new char[5];
		values[0]='j';
		values[1]='a';
		values[2]='v';
		values[3]='a';

		for(char value:values)
		{
			System.out.println(value+" ");
		}
		
		System.out.println("while====");
		float arr[] = new float[5];
		arr[0]=2.5f;
		arr[1]=3.5f;
		arr[2]=3.5f;
		arr[4]=5.5f;

		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}

		i=0;
		double darr[] = new double[3];
		darr[0]=2.5;
		darr[1]=5.5;
		darr[2]=6.5;
		System.out.println("dowhile====");

		do
		{
			System.out.println(darr[i]);
			i++;
		}while(i<darr.length);


		int arr1[] = {20,32,52,1,52,52};
		System.out.println("For each====");
		for (int ab:arr1)
		{
			System.out.println(ab+" ");
		}
	}






}

