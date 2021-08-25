package com.jbk.myapp.staticfinal;

final  class FinalEx {
	final int minimum_ammount;
	int balance;

	public FinalEx(int minimum_ammount, int balance) {
		super();
		this.minimum_ammount = minimum_ammount;
		this.balance = balance;
	}
	
	final void changebalance()
	{
		balance=balance+minimum_ammount;
		System.out.println(balance);
	}
	
	
	
	
}
