package com.qspiders.Final.MockPrograms;

public class ReverseStringWithoutReverse {
	
	public static void main(String[] args) {
		
		String str = "JAVA";
		
		System.out.println("The Original String is: " + str);
		
		String strReverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			strReverse = strReverse + str.charAt(i);
		}
		
		System.out.println("The Reversed String is: " + strReverse);
	}

}
