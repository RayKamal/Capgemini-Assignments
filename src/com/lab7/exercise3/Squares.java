package com.lab7.exercise3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;



public class Squares {
	public static HashMap<Integer,Integer> getSquarenumber(int[] intArray)
	{
		int intindex;
		HashMap<Integer,Integer> intCount=new LinkedHashMap<>();
		for(intindex=0;intindex<intArray.length;intindex++)
		{
			
				intCount.put(intArray[intindex],intArray[intindex]*intArray[intindex]);
			
		}
		return intCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {1,2,3,4,5};
		HashMap<Integer,Integer> intSquare;
		intSquare=getSquarenumber(intArray);
		for(Entry<Integer, Integer> entry:intSquare.entrySet())
		{
			System.out.println(entry.getKey()+" " +entry.getValue());
		}

	}

}
