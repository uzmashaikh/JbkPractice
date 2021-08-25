package com.jbk.myapp.milestone3;

public class Pattern11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int p =2,q=2;
		for(int i=0;i<=2;i++,p++,q--)
		{
			for(int j=0;j<=4;j++)
			{	
				if(j>=p && j<=q)
					System.out.print("*");
				else
					
					System.out.print("");
			}
			System.out.println();
		}
	}

}
