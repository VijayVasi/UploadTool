package com.qspiders.BlackBelt.Set5;

public class ExtractNumbers
{
	public static void main(String...args)
	{
		String str = "a6c3ww8zc6";

		String str1 = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);

			if(Character.isDigit(ch))
			{
				str1 = str1+ch;
			}
			
		}

		System.out.println(str1);
	}

}
