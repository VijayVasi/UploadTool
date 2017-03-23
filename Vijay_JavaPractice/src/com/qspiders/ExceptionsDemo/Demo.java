package com.qspiders.ExceptionsDemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		int j;
		
			
		try{
			
			System.out.println("Inside Try Block");
				
			 j=i/0;
			 
			 System.out.println("Exiting Try Block");
			 
			}
		
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println("Inside Catch Block");
			}


	}

}
