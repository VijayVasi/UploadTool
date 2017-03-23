package com.qspiders.BlackBelt.Set6;

public class AverageOfArray
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70};
		int sum=0;
		
		for(int s:arr)
		{
			sum = sum+s;
		}
		
		System.out.println("Average Of Array is " + (sum/arr.length));
	}
}