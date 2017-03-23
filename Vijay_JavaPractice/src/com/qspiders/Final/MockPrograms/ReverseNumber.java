package com.qspiders.Final.MockPrograms;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		int number = 1234;
		int reversedNumber=0;
		int temp=0;
		
		while (number>0)
		{
			temp = number%10;	//4	//3	//2	//1
			reversedNumber = reversedNumber*10 + temp; //4	//43	//4321
			number=number/10;	//123	//12	//1		//0	
		}
		
		System.out.println("ReversedNumber is " + reversedNumber);
	}
}