package com.qspiders.ImportantPrograms;

import java.util.Arrays;

public class CopyArrayContents
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[5];
		System.out.println("Original Array is : arr");
		System.out.println(Arrays.toString(arr));
		
		//arr1 = arr;			//Method1
		
		for(int i=0; i<arr.length; i++)		//Method 2
		{
			arr1[i]=arr[i];
		}
		
		System.out.println("Copied Array is : arr1");
		System.out.println(Arrays.toString(arr1));
	}
}