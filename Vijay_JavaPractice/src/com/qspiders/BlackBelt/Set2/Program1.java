package com.qspiders.BlackBelt.Set2;

public class Program1
{
	public static void main(String...args)
	{
		int x = 10;
		int y = 20;
		int temp;

		System.out.println("Before Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

		temp=x;
		x=y;
		y=temp;

		System.out.println("After Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}

}
