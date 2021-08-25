package com.jbk.myapp.milestone3.array;
import java.util.*;
public class MatrixMultiply {
	public static void main(String[] args) {
		
	
	int A[][]= {{2,1,2},{1,2,3}};
	int B[][] = {{2,1},{1,3},{4,5}};
	
	int C[][] =new int[2][2];
	int i,j;
	
	for( i =0; i<2;i++) {
		
		for(j=0;j<2;j++)
		{
			C[i][j]=0;
			for (int k=0;k<3;k++)// k is for traversing locations
			{
				C[i][j]+=A[i][k]*B[k][j];
			}
			System.out.print(C[i][j]+" ");

		}
		System.out.println();
	}
	
	
	}
	

}
