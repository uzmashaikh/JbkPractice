package com.jbk.myapp.milestone2;
import java.util.*;


public class PrimeFactor {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter no to check the prime factor");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2;i<=num;i++)
		{
			while(num%i == 0)
			{
				System.out.println(i+" ");
				num=num/i;
				
			}
		}
		if(num>2)
		{
			System.out.println(num);
		}
				

	}

}
