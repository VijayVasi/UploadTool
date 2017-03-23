package com.qspiders.BlackBelt.Set1;

public class Question25
{
	static int add (int...j)
	{
		int sum = 0;

		for(int i=0; i<j.length; i++)	
		{
			sum = sum + j[i];
		}
		
		return sum;
	}



	public static void main(String[] args)
	{	
		int x[] = {1, 2, 3, 4};
		System.out.println(add(x));
	}
}
