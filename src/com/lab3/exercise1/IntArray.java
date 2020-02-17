package com.lab3.exercise1;

import java.util.Arrays;

public class IntArray {
	int secondSortElement;
	
	public int getSecondSmallest  (int[] intInteger)
	{
		Arrays.sort(intInteger,0,intInteger.length);
		secondSortElement=intInteger[1];
		return secondSortElement ;
		
	}

}
