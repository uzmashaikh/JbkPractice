package com.jbk.myapp.milestone1;
import java.util.Scanner;
public class PercentageCal {
	
	int phy,chm,math, computer, bio;
	
	void cal() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks  phy,chm,math, computer, bio");
		phy=sc.nextInt();
		chm=sc.nextInt();
		math=sc.nextInt();
		computer=sc.nextInt();
		bio=sc.nextInt();
		
		int percentage=(phy+chm+math+ computer+ bio)/5;
		System.out.println("Percent is"+ percentage);
		
		if (percentage >=90 )
			System.out.println("A grade");
		else if (percentage >=80 )
			System.out.println("B grade");
		else if (percentage >=70  )
			System.out.println("C grade");
		else if (percentage >=60 )
			System.out.println("D grade");
		else if (percentage >=50 )
			System.out.println("E grade");
		else if (percentage <=40)
			System.out.println("F grade");
	}
	
	public static void main(String[] args) {
		PercentageCal obj = new PercentageCal();
		obj.cal();
		
	}


}
