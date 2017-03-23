package com.qspiders.ImportantPrograms;

public class PrimeNumbers
{
	public static void main(String[] args) 
	{
		int Total=0;
		int Range = 100000;
		int Current = 0;
		
		boolean flag;
		
			while (Current<Range)		//1st n prime numbers
			{
				if(Total<1000)
				{
					flag = true;
				
					for (int i=2; i<Current; i++)
					{
						if(Current%i == 0)
						{
							flag = false;
							break;
						}
					}
				
					if(flag)
					{
						System.out.println(Current + " ");
						Total++;
					}
				}
				
				Current++;
			}	
	}
}