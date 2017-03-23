package com.qspiders.Final.MockPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Please Enter Something: ");
			
			int Input = sc.nextInt();
			
			System.out.println("The Entered number is: " + Input);
		}
		
		catch(InputMismatchException e)	
		{
			System.out.println("It is not an Integer");
			e.printStackTrace();
		}
		
		
	}

}
