package com.jbk.myapp.milestone3.part1;
import java.util.*;


public class Area {
		public static void main(String[] args) {
			

			float radius,area;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter radius of circle");
			radius=sc.nextFloat();
			
			 area=(float)(Math.PI)*radius*radius;
			System.out.println("Area ofcircle is:"+area);
		}
	
}
