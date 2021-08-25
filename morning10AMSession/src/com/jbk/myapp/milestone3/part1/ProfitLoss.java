package com.jbk.myapp.milestone3.part1;
import java.util.*;


public class ProfitLoss {
		public static void main(String[] args) {
			

			int avg;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Cost price and selling pric");
			int CP=sc.nextInt();
			int SP=sc.nextInt();
			
			if(SP>CP)
			{
				System.out.println("Profit...of"+(SP-CP));
			}
			else
				System.out.println("Loss....of"+(CP-SP));
		}
	
}
