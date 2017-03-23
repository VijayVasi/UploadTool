package com.qspiders.ExceptionsDemo;

public class Demo121
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		System.out.println(test());
		System.out.println("main ends");
	}
	
	static String test()
	{
		int i=10;
		int j=0;
		
		try
		{
			j=i/0;
			return "pass";
		}
		
		catch(ArithmeticException exp)
		{
			exp.printStackTrace();
			return "fail";
		}
		
		finally
		{
			return "passfail";
		}
	}
}