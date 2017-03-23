package com.qspiders.ExceptionsDemo;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo118
{
	public static void main(String[] args) 
	{
		String str = " ";
		
		Scanner sc = new Scanner(str);
		
		try
		{
			int i=sc.nextInt();
		}
		
		catch(NoSuchElementException iaexp)
		{
			iaexp.printStackTrace();
		}
	}
}