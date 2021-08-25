package com.jbk.myapp.milestone2;
import java.util.*;


public class Power {

	void calPow() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter no to check if it is power of 2");
		int no = sc.nextInt();
		
		while(no%2==0)
		{
			no=no/2;
		}
		if(no==1)
		{
			System.out.println("The no" +no + "is power of 2");

		}
		else
		{
			System.out.println("Not power of 2");

		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power obj = new Power();
		obj.calPow();
		

	}

}
