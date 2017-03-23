package com.qspiders.ImportantPrograms;

public class StringReverse
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("VIJAY");
		System.out.println("Before Reverse: " + s1);
		
		s1.reverse();
		
		System.out.println("After Reverse: " + s1);
		
		
		
		StringBuffer s2 = new StringBuffer("JAVA CLASS");
		System.out.println("Before Reverse: " + s2);
		
		s2.reverse();
		
		System.out.println("After Reverse: " + s2);
		
	}
}