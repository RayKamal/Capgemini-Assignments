package com.lab7.exercise8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ModifyClass {
	public  int[] getSquarenumber(int[] intArray)
	{
		int intindex,value = 1,length1;
		int intWithoutDuplicate[];
		int len=0;
		HashMap<Integer,Integer> intCount=new LinkedHashMap<>();
		for(intindex=0;intindex<intArray.length;intindex++)
		{
			
				if(intCount.containsKey((intArray[intindex])))
				{
					value=intCount.get(intArray[intindex]);
			       intCount.put(intArray[intindex],value+1);
				}
				else
				{
					 intCount.put(intArray[intindex],value);
				}
			
		}
		length1=intCount.size();
		intWithoutDuplicate=new int[length1];
		for(Entry<Integer, Integer> entry:intCount.entrySet())
		{
			intWithoutDuplicate[len]=entry.getKey();
			len++;
			//System.out.println(entry.getKey()+" " +entry.getValue());
		}
		return intWithoutDuplicate;
	}

	

}
