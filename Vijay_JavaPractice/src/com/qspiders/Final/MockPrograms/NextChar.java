package com.qspiders.Final.MockPrograms;

public class NextChar
{
	public static void main(String[] args) 
	{
		
		String str = "SELENIUM";
		
		StringBuffer strB = new StringBuffer();
		
		char arr[] = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			char ch = arr[i];
			strB = strB.append(++ch);
		}
		
		System.out.println(strB);
		
	}
}
