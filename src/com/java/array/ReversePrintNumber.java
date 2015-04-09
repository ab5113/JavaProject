package com.java.array;

public class ReversePrintNumber {

	public static void main(String[] args) 
	{
		int[] print={1,5,6,7,8};
		System.out.println("Printing reversed array");
		for(int i= print.length-1; i >= 0 ; i -- )
		{

		  System.out.println(print[i]);
		}
        
	}
}
