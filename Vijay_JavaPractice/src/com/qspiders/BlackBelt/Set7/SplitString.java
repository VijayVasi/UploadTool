package com.qspiders.BlackBelt.Set7;

public class SplitString {

	public static void main(String[] args)
	{
		String str = "I am in ebay";
		
		String[] temp;
		
		String delimiter = " ";	//where to break the line, the word is called a delimiter
		
		temp = str.split(delimiter);
		
		for(int i=0; i<=temp.length - 1; i++)
		{
			System.out.println(temp[i]);
		}

	}

}
