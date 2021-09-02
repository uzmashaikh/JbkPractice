package com.jbk.myapp.Exception;

import com.jbk.myapp.constructor.Test;

public class TestCustomException {

	public static void main(String[] args) {

		int age=10;
		try {

			if(age<18)
			{
				System.out.println("InvalidAge");
				throw new CustomException();
			}
			else
				System.out.println("Valid for Voting");

		}
		catch (CustomException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception caught...");
		}
		System.out.println("byeee");
		
		

	}

}
