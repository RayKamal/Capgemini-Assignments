package com.lab1.exercise1;

public class SumClass {
	int RangeLoop = 0;
	int sum=0;
	
	public int calculateSum(int naturalNumberRange)
	{
		 for ( RangeLoop = 0; RangeLoop<naturalNumberRange; RangeLoop++){
	          if(RangeLoop%3==0||RangeLoop%5==0)
	          {
	        	  sum+=RangeLoop;
	          }
	       }
		return sum;
		 
	}

}
