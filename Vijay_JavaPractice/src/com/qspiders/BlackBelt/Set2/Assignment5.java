package com.qspiders.BlackBelt.Set2;

import java.util.Scanner;

public class Assignment5
{

	public static void main(String...args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of odd numbers to be printed: ");
		int count = sc.nextInt();

		int counter=0;

		for(int i=1; i<=50; i++)
		{
			if(counter<count)
			{
				if((i%2)!=0)
				{
					System.out.println(i);
					counter+=1;

				}
			}
		}
	}
}
