package com.qspiders.ImportantPrograms;

public class JavaPattern
{
	public static void main(String[] args) 
	{
		String s1 = "JAVA";
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			
			for (int k=s1.length()-1-i; k>=1; k--)
				System.out.print(" ");
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1.charAt(j)+ " ");
			}
			
			System.out.println();
		}
	}
}