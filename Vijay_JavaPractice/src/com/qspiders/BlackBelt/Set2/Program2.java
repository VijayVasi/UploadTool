package com.qspiders.BlackBelt.Set2;

public class Program2
{
	public static void main(String...args)
	{
		int x = 10;
		int y = 20;

		System.out.println("Before Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("After Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}

}
