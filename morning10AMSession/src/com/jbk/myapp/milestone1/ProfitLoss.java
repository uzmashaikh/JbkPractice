package com.jbk.myapp.milestone1;
import java.util.*;
public class ProfitLoss {
	
	float sellingprice;
	float costprice;
	
	void profit()
	{
		System.out.println("Enter selling price and cost price");
		Scanner sc =  new Scanner(System.in);
		sellingprice=sc.nextFloat();

		costprice = sc.nextFloat();
		
		if(sellingprice > costprice)
		{
			System.out.println("Its profit");
			float profit = (costprice)-sellingprice;
			System.out.println(profit);
			
		}
		else 
			System.out.println("Loss");
	}
	public static void main(String[] args) {
		ProfitLoss obj = new ProfitLoss();
		obj.profit();
	}
	

}
