package com.qspiders.ExceptionsDemo;

public class Demo113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j;
		
			
		try
		{
			System.out.println("Inside Try Block");
			j=i/0;
		}
		
		catch(ArithmeticException exp)
		{
			System.out.println("Inside ArithmeticException Catch Block");
			exp.printStackTrace();	
		}
		
		try
		{
			System.out.println("Inside NumberFormatException Try Block");
			int k=Integer.parseInt("test");
		}

		catch(NumberFormatException exp)
		{
			System.out.println("Inside NumberFormatException Catch Block");
			exp.printStackTrace();	
		}

	}

}
