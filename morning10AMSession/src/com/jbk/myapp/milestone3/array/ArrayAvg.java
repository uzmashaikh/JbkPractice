package com.jbk.myapp.milestone3.array;

public class ArrayAvg {
		
	public static void main(String[] args) {
		int a[] =new int[5];
		a[0]=20;
		a[1]=64;
		a[2]=24;
		a[3]=26;
		a[4]=30;
		
		int sum=0;
		int avg=0;
		int res=1;
		
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		avg=sum/a.length;
		System.out.println(avg);
		
		for(int i=0;i<a.length;i++)
			res=res*a[i];
		System.out.println(res);
	
	}
}
	
