package com.qspiders.BlackBelt.Set1;

public class Question26
{
	public static void main(String[] args)
	{	
		int x = 10;
		int y = 20;

		System.out.println("Before Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

		x=x+y;
		y=x-y;     // swap logic without temp variable
		x=x-y;

		//temp=x; //using temp variable
		//x=y;
		//x=temp;

		System.out.println("After Swap");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}
}
