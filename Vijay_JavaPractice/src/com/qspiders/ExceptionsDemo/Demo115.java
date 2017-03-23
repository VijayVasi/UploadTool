package com.qspiders.ExceptionsDemo;

public class Demo115
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i=10;
		int j=0;
		
		try
		{
			System.out.println("Inside Try Block");
			j=i/0;
		}
		
		catch(ArithmeticException exp)
		{
			System.out.println("Inside Arithmetic exception catch block");
			exp.printStackTrace();
		}
		
		finally
		{
			System.out.println("Inside Finally Block");
			System.out.println("i="+i);
		}
			
	}

}
