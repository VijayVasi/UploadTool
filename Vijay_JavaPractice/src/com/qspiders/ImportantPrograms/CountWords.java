package com.qspiders.ImportantPrograms;

public class CountWords
{
	public static void main(String[] args) 
	{
		String str = "Java is a Programming language and Selenium is a scripting language";
		
		String words[] = str.split(" ");	//split function will break at space here
		
		System.out.println("No of words are: " + words.length);
	}
}