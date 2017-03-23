package com.qspiders.ExceptionsDemo;

public class Demo112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j;
		
			
		try
		{
			System.out.println("Inside Try Block");
			//j=i/0;
			int k=Integer.parseInt("test");
		}
		
		catch(ArithmeticException exp)
		{
			System.out.println("Inside ArithmeticException Catch Block");
			exp.printStackTrace();	
		}

		catch(NumberFormatException exp)
		{
			System.out.println("Inside NumberFormatException Catch Block");
			exp.printStackTrace();	
		}
		
		System.out.println("i="+i);

	}

}
