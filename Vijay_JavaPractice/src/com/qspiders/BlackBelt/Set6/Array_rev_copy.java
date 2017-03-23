package com.qspiders.BlackBelt.Set6;

public class Array_rev_copy
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		
		for(int b:arr)
		{
			System.out.print(b + " ");
		}
		
		int arr1[] = new int[5];
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			arr1[i] = arr[arr.length - (i+1)];
		}
		
		System.out.println();
		
		for(int b:arr1)
		{
			System.out.print(b + " ");
		}
	}
}