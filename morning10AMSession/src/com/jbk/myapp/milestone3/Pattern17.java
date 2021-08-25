package com.jbk.myapp.milestone3;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		for(int i=0;i<=3;i++,k--)
		{
			for(int j=0;j<=3;j++)
			{
				if(j>=k)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
