package com.jbk.myapp.constructor;

public class ProtectedConstrutor {
	protected ProtectedConstrutor()
	{
		System.out.println("hiiii");
	}
	public ProtectedConstrutor(int num)
	{
		this();
		System.out.println(num);
	}
	private ProtectedConstrutor(int a,int b)
{
	System.out.println("nns,m");
}
	
	void m1()
	{
		ProtectedConstrutor obj  = new ProtectedConstrutor();
	}
	/*public static void main(String[] args) {
		ProtectedConstrutor obj3 = new ProtectedConstrutor(20,40);
		ProtectedConstrutor obj4 = new ProtectedConstrutor(20);


	}*/
}
