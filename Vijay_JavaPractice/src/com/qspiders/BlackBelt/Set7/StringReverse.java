package com.qspiders.BlackBelt.Set7;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args)
	{
		String original, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to Reverse: ");
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse of Entered String is: " + reverse);

	}

}
