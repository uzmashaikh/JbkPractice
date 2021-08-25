package com.jbk.myapp.milestone3;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==2 &&j==2) 
					System.out.println("@");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
