package com.java.array;

import java.util.Scanner;

public class ReadingArray
{

	
	public static void main(String[] args) 
	{
		int n = 0;
		int length =0 ;
		int[] array = new int[n];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			
			String token =scan.next();
			array[i]=Integer.parseInt(token);
		}
		System.out.println("Here collected the array and print");
		length = array.length;
		for(int l=0;l<length; l++ )
		{
			System.out.println(array[l]);
		}
	}

}
