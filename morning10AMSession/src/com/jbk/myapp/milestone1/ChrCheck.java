package com.jbk.myapp.milestone1;
import java.util.*;

public class ChrCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character or no or special char for identification");
		//for char input there s no nextChar it is next().charAt(int)
		char ch = sc.next().charAt(0);
		
		
			if((ch >=65 && ch <=90) || (ch >= 97 && ch<= 122))
			{
				System.out.println("The character is alphabet");

			}
			else if(ch >=48 && ch<= 57)
			{
				System.out.println("Char is digit");
			}
			else 
				System.out.println("Char is special symbol");
		}
	
}
