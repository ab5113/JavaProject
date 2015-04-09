package com.java.array;

public class InsertionSort {

	public static void main(String[] args)
	{
	  int[] array = {3,5,1,7,10};
	  int l =0;
	  l = array.length;
	  System.out.print(l);
	}
	
	int sortArray(int [] array,int l)
	{
	    int temp =0; 
		for(int i=1 ; i < l; i++)
	   {
		  for(int j = 0 ; j < i ; j++)
		  {
			  if(array[j]> array[i])
			  {
				  temp = array [i];
				  array[j]=array[i];	  
			  }
		  }
	   }
		
		return 0;
	}

}
