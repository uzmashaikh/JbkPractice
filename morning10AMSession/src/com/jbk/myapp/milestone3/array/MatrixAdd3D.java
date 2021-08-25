package com.jbk.myapp.milestone3.array;
import java.util.*;
public class MatrixAdd3D {
	public static void main(String[] args) {
		int A[][] = {{1,2,3},{3,4,5},{6,7,8}};
		int B[][] ={{1,1,1},{1,1,1},{1,1,1}};
		int C[][] = new int[3][3];
		System.out.println("elements for matrix A");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(A[i][j]+" ");
			System.out.println();
			

		}
			
		System.out.println("elements for matrix B");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(B[i][j]+" ");
			System.out.println();

		}
		
		System.out.println("====");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				C[i][j]=A[i][j]+B[i][j];
			System.out.print(" ");

		}
		
		System.out.println("====");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(C[i][j]+" ");
			System.out.println("");
		}
		
	}

}
