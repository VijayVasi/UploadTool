package com.qspiders.ImportantPrograms;

public class FindRepeter
{
	public static void main(String[] args) 
	{
		String str = "mmababctamantlslmag";
		
		int Distinct = 0;
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=0; j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					Distinct++;
				}
			}
			
			System.out.println(str.charAt(i)+"----" + Distinct);
		}
	}
}