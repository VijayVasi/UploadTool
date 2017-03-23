package com.qspiders.BlackBelt.Set5;

public class PrimeNumberSeries 
{
	public static void main(String[] args) 
	{
		int num1 = 1000;
		int num = 2;
		
		boolean flag;
		
		while(num<num1)
		{
			flag = true;
			
			for(int i=2; i<num; i++)
			{
				if(num%i == 0)
				{
					flag=false;
					
					break;
				}
			}
			
			if(flag)
			{
				System.out.println(num + " ");
			}
			
			num++;
			
		}
	}
}

