package com.jbk.myapp.practice;
import java.util.*;

public class Vowelcheck {

	void check()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charcter to check \n");
		char ch=sc.next().charAt(0);
		
		
		if(ch=='a' || ch == 'e'  || ch == 'i'  || ch == 'o' || ch == 'u'  )
		{
			System.out.println("Its Vowel");
		}
		else
		{
			System.out.println("Its consonant");
		}
			}


	public static void main(String[] args) {
		Vowelcheck obj = new Vowelcheck();
		obj.check();
	}

}


