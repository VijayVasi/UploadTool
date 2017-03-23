package com.qspiders.ImportantPrograms;

public class ArrayReverse
{
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 30, 40, 50};
		int[] arr1 = new int[5];
		
		for(int a:arr)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			
			arr1[i]= arr[arr.length - (i+1)];	//one line logic
		}
		
		for(int b:arr1)
		{
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println();
		
		/*String arr3[] = {"I","Love","Java"};
		String arr4[] = new String[3];
		
		for(String a:arr3)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			
			arr1[i]= arr[arr.length - (i+1)];
		}
		
		for(String b:arr4)
		{
			System.out.print(b + " ");
		}*/
		
		
	}
}