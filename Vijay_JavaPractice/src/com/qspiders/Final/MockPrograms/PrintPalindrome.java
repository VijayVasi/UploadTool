package com.qspiders.Final.MockPrograms;

public class PrintPalindrome {
	
	public static void main(String[] args) {
		
		String str = "LIRIL";
		
		System.out.println("String Before Reverse: " + str);
		
		String strReverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			strReverse = strReverse + str.charAt(i);	//dont forget to use str.charAt(i)
		}
		
		System.out.println("The Reversed String is: " + strReverse);
		
		if(str.equals(strReverse))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
