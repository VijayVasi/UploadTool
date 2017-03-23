package com.qspiders.BlackBelt.Set7;

import java.util.Random;

public class RandomNumbersInARange {

	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(randInt(1,5));
		}
	}
	
	public static int randInt(int min, int max)
	{
		Random rand = new Random();
		
		int randomNum = rand.nextInt((max-min) + 1) + min;
		
		return randomNum;
	}

}
