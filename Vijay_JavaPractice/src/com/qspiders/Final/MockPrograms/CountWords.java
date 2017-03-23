package com.qspiders.Final.MockPrograms;

public class CountWords
{
	public static void main(String[] args) 
	{
		String str = "Java is a Programming language and Selenium is a scripting language";
		
		String words[] = str.split(" ");	//use split function with space and store in a word array.
		
		System.out.println("No of words are: " + words.length);
	}
}
