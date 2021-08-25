package com.jbk.myapp.milestone3.array;
import java.util.*;
public class EvenoddAdd {
	public static void main(String[] args) {
		int n=0,evensum=0,oddsum=0;
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
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				evensum=evensum+arr[i];
			else
				oddsum=oddsum+arr[i];
		}
		System.out.println("EvenSum:"+evensum);
		System.out.println("Oddsum:"+oddsum);

	
	}
}
