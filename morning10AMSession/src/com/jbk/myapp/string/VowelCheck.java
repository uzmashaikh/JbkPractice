package com.jbk.myapp.string;
import java.util.*;


public class VowelCheck {
	public static void main(String[] args) {
		String str1;
		System.out.println("Enter  string....");
		
		Scanner sc = new Scanner(System.in);
		str1=sc.nextLine();
		
		System.out.println("Vowvels");
		for(int i=0;i<str1.length();i++)
		{	
			if(str1.charAt(i)=='a' || str1.charAt(i) == 'i' ||str1.charAt(i)=='e' || str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				System.out.println(str1.charAt(i));
			}
		}
		
		System.out.println("Consonants");
		for(int i=0;i<str1.length();i++)
		{	
			if(str1.charAt(i)!='a' && str1.charAt(i) != 'i' && str1.charAt(i) !='e' && str1.charAt(i) !='o' && str1.charAt(i)!='u')
			{
				System.out.println(str1.charAt(i));
			}
		}
		}
}
