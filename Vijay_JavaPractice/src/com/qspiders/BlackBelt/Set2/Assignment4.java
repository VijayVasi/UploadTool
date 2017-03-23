package com.qspiders.BlackBelt.Set2;

import java.util.Scanner;

public class Assignment4
{
	public static void main(String[] args)
	{
	
		Assignment4 A4 = new Assignment4();

		A4.print(1);	
	}

	void print(int i)
	{
		System.out.println(i);
		if(i<100)
		{
		print(i+1);
		}
	}
}
