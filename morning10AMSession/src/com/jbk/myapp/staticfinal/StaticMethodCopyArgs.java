package com.jbk.myapp.staticfinal;

public class StaticMethodCopyArgs {
	
	static void  copy(String arg1,String arg2)
	{
		arg1=arg2;
		System.out.println(arg1);
		System.out.println(arg2);
	}
	
	public static void main(String[] args) {
		StaticMethodCopyArgs.copy("asd", "qwe");
		StaticMethodCopyArgs obj=new StaticMethodCopyArgs();
		obj.copy("uzmaa","danny");
	}
}
