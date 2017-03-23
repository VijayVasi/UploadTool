package com.qspiders.ImportantPrograms;

public class ProvePalindrome
{
	public static void main(String[] args) 
	{
		 String s1="RAD";
		
		
		if(new StringBuffer(s1).reverse().toString().equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
	
}