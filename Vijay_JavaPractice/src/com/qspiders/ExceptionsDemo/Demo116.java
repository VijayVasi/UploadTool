package com.qspiders.ExceptionsDemo;

public class Demo116
{

	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		System.out.println(test());
		System.out.println("main method ends");
	}
		
		static String test()
		{
			int i=10;
			
			try
			{
				System.out.println("Inside Try Block");
				int j=i/0;
			}
		
			catch(ArithmeticException exp)
			{
				System.out.println("Inside Arithmetic exception catch block");
			}
		
			finally
			{
				System.out.println("Inside Finally Block");
			}
			
			return "from outside";
		}
			
}

