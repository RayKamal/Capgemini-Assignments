package com.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionClass {
	
	public static ArrayList<String> getValues (HashMap<String,Integer> data)
	{
		ArrayList<String> list=new ArrayList<>();
		 for (Entry<String, Integer> entry : data.entrySet())
		 {
			 list.add(entry.getKey());
		 }
		 Collections.sort(list); 
		 return list;
		
	}

	public static void main(String ar[])
	{
		HashMap<String,Integer> data=new HashMap<>();
		int value=1;
		ArrayList<String> list;
		data.put("satyam",value);
		data.put("amit",value);
		data.put("bittu",value);
		data.put("shivam",value);
		 list=getValues (data);
		for(String datalist:list)
		{
			System.out.println(datalist);
		}
		
	}

}
