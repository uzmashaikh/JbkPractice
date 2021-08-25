package com.jbk.myapp.polymorphism;

public class BankTest {
	public static void main(String[] args) {
		Bank b=new SBIBank();
		System.out.println("Rate of interest for sbi is..."+b.getRateofInterest());
		Bank b1=new ICICIBank();
		System.out.println("Rate of interest for ICICI is..."+b1.getRateofInterest());
		Bank b2=new AXISBank();
		System.out.println("Rate of interest for sbi is..."+b2.getRateofInterest());
	}
}