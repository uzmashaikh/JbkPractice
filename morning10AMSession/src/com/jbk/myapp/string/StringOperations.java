package com.jbk.myapp.string;
import java.util.*;


public class StringOperations {
	public static void main(String[] args) {
	
		String str1;
		String str2;
		String str3;
		System.out.println("Enter two string....");
		
		Scanner sc = new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		
		System.out.println("Enter Choice....\n1.String are equals\n"
				+ "2.String Concat\n"
				+ "3.String Length\n"
				+ "4.To upper of String1\n"
				+"5.To lower of String1\n"
				+ "5.To lower of String1\n"
				+ "6.Check two string are equal\n"
				+ "7.Comapre two strings\n"
				+ "8.Replace two strings\n");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println(str1.equals(str2));
			   break;
		
		case 2:str3=str1.concat(str2);
			   System.out.println("Concat two strings...."+str3);break;
			   
		case 3:System.out.println("String1 lenght1...."+str1.length());
			   System.out.println("Strng2 length"+str2.length());
				break;
				
		case 4:System.out.println("String1 Toupper...."+str1.toUpperCase());
				System.out.println("strng2 toupper"+str2.toUpperCase());
				break;
				
		case 5:System.out.println("String1 ToLower...."+str1.toLowerCase());
				System.out.println("Strng2 tolower"+str2.toLowerCase());
				break;
				
		case 6:System.out.println("Check two strings are equal...."+str1.equals(str2));
			   break;
			   
		case 7:System.out.println("Comapre two strings...."+str1.compareTo(str2));
			   break;
			   
		case 8:System.out.println("replace two strings...."+str1.replace(str1, "Hello"));
			   break;
			   
		default : System.out.println("Enter correct choice.....");
		          break;



		
		}
		
	
	
	}
}
