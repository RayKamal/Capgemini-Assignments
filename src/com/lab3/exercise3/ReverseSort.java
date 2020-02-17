package com.lab3.exercise3;

import java.util.Arrays;

public class ReverseSort {
	
	public int  reverse(int num)
	{
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
	}
	
	public  int[] getSorted(int intInteger[] )
	{
		for(int i=0;i< intInteger.length;i++)
		{
			intInteger[i]=reverse(intInteger[i]);
		}
		System.out.println( "reverse integer array");
		for(int i=0;i< intInteger.length;i++)
		{
			System.out.println( intInteger[i]);
		}
		System.out.print( "\n");
		return intInteger;
	}
	public  void displaySortArray(int intInteger[])
	{
		Arrays.sort(intInteger,0,intInteger.length);
		System.out.println( "display sorted integer array");
		for(int i=0;i<intInteger.length;i++)
		{
			System.out.println( intInteger[i]);
		}
		System.out.print( "\n");
	}
	

}
