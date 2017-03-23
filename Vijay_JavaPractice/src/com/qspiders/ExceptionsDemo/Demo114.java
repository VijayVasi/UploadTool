package com.qspiders.ExceptionsDemo;

public class Demo114 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i=10;
		int j=0;
		
		try
		{
			System.out.println("Inside Try Block");
			try
			{
				System.out.println("Inside Inner try Block");
				int k = Integer.parseInt("test");
			}
		
			catch(NumberFormatException exp)
			{
				System.out.println("Inside inner catch block - Number format exception");
				exp.printStackTrace();
			}
		
		System.out.println("Back to outer try block");
		
			j=i/0;
		}
			
			catch(ArithmeticException exp)
			{
				System.out.println("Inside outer catch block(Arithmetic exception)");
				exp.printStackTrace();
			}
			

	}

}
