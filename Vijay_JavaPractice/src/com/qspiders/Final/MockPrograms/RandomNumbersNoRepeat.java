package com.qspiders.Final.MockPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbersNoRepeat {
	
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(randInt(1,5)));
	}

	public static int[] randInt(int min, int max) 
	{
		Random rand = new Random();
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		int randomNum = 0;
		
		while(set.size()!=(max-min+1))
		{
			randomNum = rand.nextInt((max-min)+1)+ min;
			
			if(!set.contains(randomNum))
			{
				set.add(randomNum);
			}
		}
		
		int randvals[] = new int[max-min+1];
		Object[] intvals = set.toArray();
		
		for(int i=0; i<randvals.length; i++)
		{
			randvals[i] = ((Integer)intvals[i]).intValue();
		}
		
		return randvals;
	}

}