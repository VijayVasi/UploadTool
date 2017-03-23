package com.qspiders.Final.MockPrograms;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		String str = "VIJAYVASI";
		
		String temp = "";
		
		for(int i=0; i<str.length()-1; i++)
		{
			if(temp.indexOf(str.charAt(i))== -1)
			{
				temp = temp +str.charAt(i);
			}
		}
		
		System.out.println(temp);
		
		System.out.println("Unique Character count: " + temp.length());
	}

}
