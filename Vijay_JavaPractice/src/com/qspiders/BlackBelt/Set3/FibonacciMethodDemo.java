package com.qspiders.BlackBelt.Set3;

public class FibonacciMethodDemo
{
	public static void main(String[] args)
	{
		fibonacci(500);
	}

	static void fibonacci(int maxvalue)
	{
		if(maxvalue>0)
		{
			int first=0;
			int second=1;
			int next=1;
			System.out.print(first + " , " + second);

			int maxval=maxvalue;

			while(first+second <= maxval)
			{
				next=first+second;
				System.out.print(" , " + next);
				first=second;
				second=next;
			}
		}

		else{
			System.out.println("Invalid number");
		}

		
	}

}
