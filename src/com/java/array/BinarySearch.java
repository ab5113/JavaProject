package com.java.array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		
		String s;
		int [] arr={1,2,3,4,5,6,8,9,10,11,12,13,14};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		s = in.nextLine();
		int num = Integer.parseInt(s);
		BinarySearch bingo = new BinarySearch();
		bingo.Find(arr,num);
		
		
	}
   void Find(int[] arr, int num)
   {
	   int i=0;
	   int array_length = arr.length;
	   int m = (array_length-1)/2;
       
	   if(num > arr[m])
	   {	
		    for(i = m; i<array_length; i++)
		    {
		    	if(arr[i] == num)
		    	{
		    		System.out.println("the element position is" + " "+ i);
		    	}
		    }
		    
	   }
	   if(num < arr[m])
	   {
		   for(i = 0; i<m ;i++)
		   {
			   if(arr[i] == num)
			   {
				   System.out.println("the element position is" + " "+ i);
			   }
		   } 
	   }
	   else
	   {
   		System.out.println("element not present");
        }
   }
}
