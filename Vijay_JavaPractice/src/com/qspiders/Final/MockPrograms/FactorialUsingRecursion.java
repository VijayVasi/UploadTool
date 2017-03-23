package com.qspiders.Final.MockPrograms;

import java.util.Scanner;

public class FactorialUsingRecursion
{
		
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int num = sc.nextInt();
		System.out.println("The factorial of a number is: " + fact(num));
	}
	
	public static int fact(int n)	
	{
		if(n==1)
		{
			return 1;
		}
		
		return n*(fact(n-1));
	}
}
