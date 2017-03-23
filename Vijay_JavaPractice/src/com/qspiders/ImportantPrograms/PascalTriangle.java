package com.qspiders.ImportantPrograms;

public class PascalTriangle {
	
	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i=0; i<rows; i++)
		{
			for(int k=rows; k>i; k--)
			{
				System.out.print(" ");
			}
			int number=1;
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(number + " ");
				number = number*(i-j)/(j+1);
			}
			
			System.out.println();
		}
	}

}
