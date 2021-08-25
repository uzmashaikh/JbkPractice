package com.jbk.myapp.practice;
import java.util.*;

public class TestClimate {

	void check()
	{
		System.out.println("Enter your choice to check climate");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch)
		{
		case 2:
			System.out.println("Spring");break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summmer");break;
		case 1:
		case 12:
		case 11:
		case 10:
			System.out.println("Winter");break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Rainny Season");break;
		default:
			System.out.println("Enter correct season.....");
		}

	}


	public static void main(String[] args) {
		TestClimate obj = new TestClimate();
		obj.check();
	}

}


