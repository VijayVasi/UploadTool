package com.qspiders.Final.MockPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println("String Before Reverse: " + str);
		
		str.reverse();
		
		System.out.println("String After Reverse: " + str);
		
	}

}
