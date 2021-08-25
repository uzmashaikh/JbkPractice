package com.jbk.myapp.milestone3.part1;
import java.util.*;


public class Average {
		public static void main(String[] args) {
			

			int avg;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter 3 nos to calulate avarage");
			int input1=sc.nextInt();
			int input2=sc.nextInt();
			int input3=sc.nextInt();
			
			avg=(input1+input2+input3)/3;
			System.out.println("Avaerage:"+avg);
		}
	
}
