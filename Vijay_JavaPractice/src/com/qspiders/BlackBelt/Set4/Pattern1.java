package com.qspiders.BlackBelt.Set4;

public class Pattern1
{
	public static void main(String[] args) 
	{
				
	String str = "VIJAY";
				
	for(int i=0; i<str.length(); i++)
		{
		
			for(int k=str.length()-1-i; k>=1; k--)
				System.out.print(" ");
			
				
				for(int j=0; j<=i; j++)
				{
					System.out.print(str.charAt(j)+ " ");
				}
			
				
				System.out.println();
				
		}
	
	}

}
