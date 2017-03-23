package com.qspiders.BlackBelt.Set6;

import java.util.Arrays;

public class ConcatArray
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		
		int arr3[] = new int[arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, arr3, 0, 4);
		System.arraycopy(arr2, 0, arr3, 4, 4);
		
		System.out.println(Arrays.toString(arr3));
		
	}
}