package com.qspiders.Final.MockPrograms;

public class PrimeNumbersInARange
{
	public static void main(String[] args)
	{
		int Start=0;
		int End=20;

		boolean flag;
		
		for(int count=Start; count<=End; count++)
		{
			flag=true;
			
			for(int i=2; i<count; i++)
			{
				if(count%i == 0)
				{
					flag = false;
					break;
				}
			}
			
			if (flag)
			{
				System.out.println(count + " ");
			}
		}
	}
}
