package com.qspiders.BlackBelt.Set3;

public class AreaCalculation
{
	static double getAreaOfCircle(double rad)
	{
		final double PI = 3.142;
		double Area = PI * rad * rad;
		return Area;
	}

	static double getAreaOfSquare(double len)
	{
		double Area = len * len;
		return Area;
	}

	static double getAreaOfRectangle(double len, double breadth)
	{
		double Area = len * breadth;
		return Area;
	}

	static double getAreaOfTriangle(double base, double height)
	{
		double Area = base * height * 0.5;
		return Area;
	}

	public static void main(String...args)
	{
		System.out.println(getAreaOfCircle(5.5));
		System.out.println(getAreaOfRectangle(4,5));
		System.out.println(getAreaOfSquare(5));
		System.out.println(getAreaOfTriangle(5,6));
	}


}
