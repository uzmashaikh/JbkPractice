package com.jbk.myapp.milestone3;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				
				if(i==0 || i==4 || j==0 || j==4)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
