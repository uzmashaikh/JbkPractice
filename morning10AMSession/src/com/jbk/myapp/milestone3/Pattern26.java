package com.jbk.myapp.milestone3;
import java.util.*;
public class Pattern26 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int rows;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		rows=sc.nextInt();
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
