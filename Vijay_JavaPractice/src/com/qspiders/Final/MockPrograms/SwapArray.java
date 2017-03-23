package com.qspiders.Final.MockPrograms;

import java.util.Arrays;

public class SwapArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = {6,7,8,9,10};
		
		int[] temp = new int[arr1.length];
		
		System.out.println("Before Swapping");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		temp = arr1;
		arr1 = arr2;
		arr2 = temp;
		
		System.out.println("After Swapping");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
