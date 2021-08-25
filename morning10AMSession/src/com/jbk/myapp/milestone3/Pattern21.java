package com.jbk.myapp.milestone3;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=3) {
					System.out.print(k);
					k++;
					
				}
				else if(j==8 && i==2)
					System.out.print("2");
				else if(j>=7)
				{
					System.out.print("1");
				}
				else
					System.out.print("@");
			}
			System.out.println();
		}
	}

}
