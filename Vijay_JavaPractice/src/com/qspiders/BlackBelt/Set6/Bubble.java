package com.qspiders.BlackBelt.Set6;

public class Bubble
{
	public static void main(String[] args)
	{
		int arr[] = {89,23,45,12,67,78};
		System.out.println("--------Bubble Sorting---------");
		
		System.out.println("Before Sorting");
		for(int i=0; i <arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		//System.out.println(Arrays.toString(arr));
		
		System.out.println();
		bubbleSort(arr);
		
		System.out.println("After Sorting");
		for(int i=0; i <arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}	
	}
	
	static void bubbleSort(int[] arr)
	{
		int temp=0; //holding variable
		boolean flag = true;
		
		while(flag)
		{
			flag = false;
			for(int j=0; j<arr.length - 1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
					flag = true;
				}
			}		
				
		}
	}
}