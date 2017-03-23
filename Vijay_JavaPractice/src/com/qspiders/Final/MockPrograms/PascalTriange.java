package com.qspiders.Final.MockPrograms;

public class PascalTriange
{
	public static void main(String...args)
	{
		for(int i=1; i<=6; i++)
		{
			int c=1;
			
			for(int j=i; j<6; j++)
			{
				System.out.print(" ");
			}

			for(int k=1; k<=i; k++)
			{
				System.out.print(c);
				System.out.print(" ");
				c=c*(i-k)/k;
			}
	
			System.out.println();
		
		}
	}
}
