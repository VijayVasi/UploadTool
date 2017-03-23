package com.qspiders.ExceptionsDemo;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo117
{
	public static void main(String[] args) 
	{
		String str = "12.56";
		Scanner sc = new Scanner(str);
		
		int i=0;
		//sc.close();	//will throw Illegal state exception
		
		try
		{
			i=sc.nextInt();
		}
		
		//catch(InputMismatchException imexp) // child of no such exception
		//{
			//System.out.println("Input Mismatch exception");
		//}
		
		catch(NoSuchElementException nexp)
		{
			System.out.println("No such element exception");
		}
		
		catch(IllegalStateException iaexp)
		{
			System.out.println("Illegal state exception");
		}
		
		System.out.println(i);
		
	}
}