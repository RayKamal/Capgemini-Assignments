package com.lab3.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	int n; //for length of string
	public char[] upperCaseLowerCase(char[] charArray)
	{
		Arrays.sort(charArray,0,charArray.length);
		n=charArray.length;
		if(n%2==0)
		{
			for(int i=0;i<n;i++)//i is used for iterate the loop
			{
				if(i<(n/2))
				{
					charArray[i]=Character.toUpperCase(charArray[i]);
				}
				else
					charArray[i]=Character.toLowerCase(charArray[i]);
				
			}
		}
		else
		{
			for(int i=0;i<n;i++)//i is used for iterate the loop
			{
				if(i<((n+1)/2))
				{
					charArray[i]=Character.toUpperCase(charArray[i]);
				}
				else
					charArray[i]=Character.toLowerCase(charArray[i]);
				
			}
		}
		
		return charArray;
	}
		

}
