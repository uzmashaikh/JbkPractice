package com.jbk.myapp.milestone3.array;
import java.util.*;
public class MatrixSub {
	public static void main(String[] args) {
		int A[][] =new int[2][2];
		int B[][] =new int[2][2];
		int C[][] = new int[2][2];
		System.out.println("Enter elements for matrix A");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
				A[i][j]=sc.nextInt();
			System.out.println("");

		}
			
		System.out.println("Enter elements for matrix B");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
				B[i][j]=sc.nextInt();
			System.out.println("");
		}
		
		System.out.println("====");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
				C[i][j]=A[i][j]-B[i][j];
			System.out.println("");

		}
		
		System.out.println("====");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
				System.out.print(C[i][j]);
			System.out.println("");
		}
		
	}

}
