package com.lab3.exercise4;

import java.util.Arrays;

public class OccurenceClass {

	
	char charArray[];
	OccurenceClass(char []charArray){
		
		this.charArray=charArray;
		Arrays.sort(charArray,0,charArray.length);
	}
	
	public void countCharOccurence()
	{
		char singleElement=charArray[0];
		int count=1;
		for(int i=1;i<charArray.length;i++)
		{
			if(singleElement==charArray[i])
			{
				count++;
			}
			else
			{
				System.out.println(singleElement+" : "+count);
				 singleElement=charArray[i];
				count=1;
						
			}
		}
		System.out.println(singleElement+" : "+count);
		
	}
}
