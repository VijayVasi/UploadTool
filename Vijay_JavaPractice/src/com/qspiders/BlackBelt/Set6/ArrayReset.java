package com.qspiders.BlackBelt.Set6;

public class ArrayReset
{
	public static void main(String[] args)
	{
		int arr[] = {20,48,38,29,69};
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		
		
	}
}