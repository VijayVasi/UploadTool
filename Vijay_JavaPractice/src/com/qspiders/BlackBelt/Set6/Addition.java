package com.qspiders.BlackBelt.Set6;

public class Addition
{
	public static void main(String[] args) 
	{
		int arr1[] = {10, 20, 30};
		int arr2[] = {40, 50, 60};
		
		int[] arr3 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++)
		{
			arr3[i] = arr1[i] + arr2[i];
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
	}
}