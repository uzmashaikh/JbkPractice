package com.jbk.myapp.milestone3.part1;
import java.util.*;


public class LeapYear {
		public static void main(String[] args) {
			

			long year;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter year to check leap year");
			year=sc.nextLong();
			
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Leap year");
			}
			else
				System.out.println("Not a leap year");
		}
	
}
