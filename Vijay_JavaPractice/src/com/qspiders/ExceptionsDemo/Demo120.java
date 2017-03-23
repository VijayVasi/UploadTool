package com.qspiders.ExceptionsDemo;

import java.util.Scanner;

public class Demo120
{
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int i = sc.nextInt();
		}
		
		catch(Exception e)
		{
			
		}
		
		//finally
		//{
			//sc.close(); // will be put by the compiler automatically
		//}
	}
}