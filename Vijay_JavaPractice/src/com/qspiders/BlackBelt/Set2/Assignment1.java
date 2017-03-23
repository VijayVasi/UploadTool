package com.qspiders.BlackBelt.Set2;

public class Assignment1
{
	public static void main(String[] args)
	{	
		int a=15;
		int b=10;
		int comp;

		comp = (~b)+1;	//Computing compliment of 1st number and adding +1
		int res = comp + a;

		System.out.println("Difference of a and b is: " + res);	
	}
}


//Logic
//Take 2's complement of smaller number out of 2 numbers
//Add it to 1st number

//Taking 2's complement
//Invert all the binary digits: Ex: 1010 invertion is 0101
//add +1 to the complement
