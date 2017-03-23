package com.qspiders.BlackBelt.Set1;

import java.util.Scanner;

public class Assignment1
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int input1 = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int input2 = sc.nextInt();

		int res = input1 + input2;

		System.out.println("Sum of two numbers is " + res);

	}
}
