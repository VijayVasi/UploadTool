package com.qspiders.BlackBelt.Set5;

public class ConvertLong 
{
	public static void main(String[] args) 
	{
		Long l1 = new Long(100);
		Long l2 = new Long(new Integer(100));
		Long l3 = new Long(new Integer(100).longValue());
		
		System.out.println(l1 + "\n" + l2 + "\n" + l3);
		
	}
}

