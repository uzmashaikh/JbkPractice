package com.jbk.myapp.milestone3;
import java.util.*;
public class Flag {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{	 
				if(i==2 && j==5)
				{
					System.out.print(" ");
				}
				
				else if(i==3 &&( j>=4 &&j<=6))
				{
					System.out.print(" ");
				}
				else if(i==4 &&( j>=3 &&j<=7))
				{
					System.out.print(" ");
				}
				else if(i==5 &&( j>=2 &&j<=8))
				{
					System.out.print(" ");
				}
				
				
				
				else
				{
				
				System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
