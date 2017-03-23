package com.qspiders.BlackBelt.Set6;

public class ArrayUnselect
{
	public static void main(String[] args)
	{
		String s = "VIJAYVASI";
		
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!='V')
			{
				System.out.print(ch[i]);
			}
		}
		
	}
}