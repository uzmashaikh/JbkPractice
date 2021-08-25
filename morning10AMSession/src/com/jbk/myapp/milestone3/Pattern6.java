package com.jbk.myapp.milestone3;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<=2;i++)
		{
			for(int j=1;j<=9;j++)
			{
				
				
				if(j<=3 ||j >= 7)
				{
					System.out.print(j);
					
				}
				else
				{
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}

}
