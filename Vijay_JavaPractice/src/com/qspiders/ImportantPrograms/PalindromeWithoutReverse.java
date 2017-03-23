package com.qspiders.ImportantPrograms;

public class PalindromeWithoutReverse
{
	public static void main(String[] args) 
	{
		String str = new String("LIRI");
		System.out.println("Before Reverse: " + str);
		
		String strReverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			strReverse = strReverse + str.charAt(i);
		}
		
		System.out.println("After Reverse: " + strReverse);
		
		if(str.equals(strReverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}