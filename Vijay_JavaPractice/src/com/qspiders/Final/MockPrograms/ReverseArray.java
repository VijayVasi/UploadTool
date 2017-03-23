package com.qspiders.Final.MockPrograms;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50};
		
		System.out.println("The Array Before Reverse: ");
		
		for(int a:arr)
		{
			System.out.print(a + " ");
		}
		
		int[] arr1 = new int[arr.length];
		
		for(int i=0; i<=arr1.length-1; i++)
		{
			arr1[i]=arr[arr.length - (i+1)];
		}
		
		System.out.println();
		
		System.out.println("The Array After Reverse: ");
		
		for(int b:arr1)
		{
			System.out.print(b + " ");
		}
		
	}

}
