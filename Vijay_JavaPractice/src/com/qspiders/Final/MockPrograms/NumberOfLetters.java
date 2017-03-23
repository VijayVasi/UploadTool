package com.qspiders.Final.MockPrograms;

public class NumberOfLetters {
	
	public static void main(String[] args) {
		
		String str = "SweeterSweater";
		
		int cntr =0;
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)=='e')
			{
				cntr++;
			}
		}
		
		System.out.println("The number of e's present in the word are: " + cntr);
		
	}

}
