package com.jbk.myapp.milestone1;

import java.util.Scanner;

public class SalaryCalc {
	double basicsalary;
	double grosssalary;
	double hra;
	double da;
	
	
	void calSal()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		basicsalary=sc.nextDouble();
		if(basicsalary<=10000)
		{
			hra=basicsalary*0.2;
			da=basicsalary*0.8;
			System.out.println("Hra is:"+hra);
			System.out.println("da is:"+da);
			grosssalary=basicsalary +hra+da;
			System.out.println("gross salary is..."+grosssalary);
		}
		else if(basicsalary<=20000)
		{
			hra=basicsalary*0.25;
			da=basicsalary*0.9;
			System.out.println("Hra is:"+hra);
			System.out.println("da is:"+da);
			grosssalary=basicsalary +hra +da;
			System.out.println("gross salary is..."+grosssalary);
		}
		else if(basicsalary>20000)
		{
			hra=basicsalary*0.3;
			da=basicsalary*0.95;
			System.out.println("Hra is:"+hra);
			System.out.println("da is:"+da);
			grosssalary=basicsalary +hra+da;
			System.out.println("gross salary is..."+grosssalary);
		}
		else
			System.out.println("enter prpoer input");
	sc.close();
	}
	public static void main(String[] args) {
		SalaryCalc obj = new SalaryCalc();
		obj.calSal();
	}
	
}
