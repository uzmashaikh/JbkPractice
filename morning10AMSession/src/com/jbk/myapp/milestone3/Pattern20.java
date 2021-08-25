package com.jbk.myapp.milestone3;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=9;j++)
			{
				
				if(j<=3 || j>=7)
				{
					System.out.print(j);
				}
				else 
					System.out.print("@");
			}
			System.out.println();
		}
	}

}
