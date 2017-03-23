package com.qspiders.BlackBelt.Set7;

public class CountnumofstringLen {

	public static void main(String[] args) {
		
		System.out.println("-----------1st Way---------");
		
		String s = "James Gosling";
		
		int i=0;
		
		for(char c:s.toCharArray())
		{
			i++;
		}
		
		System.out.println(i);
		
		System.out.println("-----------2nd Way---------");
		
		String s1 = "James Gosling";
		
		System.out.println(s1.concat(" ").lastIndexOf(" "));

	}

}
