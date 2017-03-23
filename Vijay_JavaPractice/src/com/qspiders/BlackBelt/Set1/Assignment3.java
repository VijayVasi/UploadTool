package com.qspiders.BlackBelt.Set1;

import java.util.Scanner;

class Assignment3
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of one side of square");
		int Side = sc.nextInt();
		
		double Area = (Side*Side);

		System.out.println("The area of square is " + Area + " Sq mts");
	}


}
