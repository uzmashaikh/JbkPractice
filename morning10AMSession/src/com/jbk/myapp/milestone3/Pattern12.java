package com.jbk.myapp.milestone3;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{	
				if(i==0 || i== 4 ||j==0 || j==4)
				
					System.out.print("*");
				else
					System.out.print("#");
				}
			System.out.println();
		}
	}

}
