package com.qspiders.ImportantPrograms;

public class FloydsTriangle {
	
	public static void main(String[] args) {
		
		int num=1;
		
		for(int i=0; i<5; i++)
		{
			
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}
	}

}
