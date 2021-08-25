package com.jbk.myapp.milestone3;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,l=1,m=2,n=3;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0)
				{
					System.out.print(k);
					k++;
				}
				else if (i==1)
				{
					
					System.out.print(l);
					l++;
				}
				else if(i==2)
				{
					
					System.out.print(m);
					m++;
				}
				else
				{
				
					System.out.print(n);
					n++;
				}
				
			}
			System.out.println();
		}
	}
}
