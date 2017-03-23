package com.qspiders.BlackBelt.Set6;

public class Rowwise
{
	public static void main(String[] args) 
	{
		String [][] arr = {{"ID","Name","City"},{"1","Aru","Blore"},{"2","Ghoshal","Mumbai"},{"3","Hasini","Cpet"}};
		
		for(String[] s:arr)
		{
			String str = "";
			for(String s1:s)
			{
				str = str+s1+" ";
			}
			
			System.out.println(str);
		}
	}
}