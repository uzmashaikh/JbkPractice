package com.jbk.myapp.milestone3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=4;j++)
			{


				if(i%2==0)
				{
					System.out.print("#");

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
