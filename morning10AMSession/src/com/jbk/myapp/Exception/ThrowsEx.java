package com.jbk.myapp.Exception;

public class ThrowsEx {
	
	void throwmtd()throws NullPointerException {
		
		System.out.println("Inside throw method...");
		throw new NullPointerException();
		
	}
	public static void main(String[] args) {
		try
		{	
			
			ThrowsEx obj = new ThrowsEx();
			obj.throwmtd();
		}
		catch(NullPointerException e)
		{
			System.out.println("exception caught"+e);
		}
		
	}
}
