package com.qspiders.ImportantPrograms;

public class ReverseWithoutReverseFunction
{
	public static void main(String[] args) 
	{
		String str = new String("HELLO");
		System.out.println("Before Reverse: " + str);
		
		String strReverse = " ";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			strReverse = strReverse + str.charAt(i);
		}
		
		System.out.println("After Reverse: " + strReverse);
	}
}