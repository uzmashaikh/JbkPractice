package com.jbk.myapp.milestone3;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1,q=2,r=3;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0)
				{
				System.out.print(j);
				}
				else if(i==1)
				{
					System.out.print(p);
					p++;
				}
				else if(i==2)
				{
					System.out.print(q);
					p++;
				}
				else
				{
					System.out.print(r);
					r++;
					
				}
			}
			System.out.println();
		}
	}

}
