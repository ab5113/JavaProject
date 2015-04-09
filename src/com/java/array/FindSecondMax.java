package com.java.array;

public class FindSecondMax{
 public static void main(String args[])
 {
	 int[] secondMax= {7,2,3,4,5,1,8,1};
	 int result = 0;
	 FindSecondMax obj = new FindSecondMax();
	 result = obj.SecondMax(secondMax);
	 System.out.println("Second Max is " + result);
	 
 }
	int SecondMax(int[] secondMax)	
	{
	      int First_Max= 0;
	      int Second_Max=0;
	         for (int i=0; i < secondMax.length; i++)
	      {
	    	  if(First_Max < secondMax[i])
	    	  {
	    		  Second_Max = First_Max;
	    	      First_Max = secondMax[i];
	    	     
	    	  }
	    	 if (Second_Max < secondMax[i] && First_Max != secondMax[i])
	    	  {
	    		  Second_Max = secondMax[i];
	    	  }
	      }     	  
	         return Second_Max;     
	}
	      
}  
