package com.lab7.exercise4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Medals {
	public static HashMap<String,String> getStudents  (HashMap<String,Integer> map)
	{
		int intindex;
		HashMap<String,String> map1=new LinkedHashMap<>();
		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>=90)
			{
				map1.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()<90&&entry.getValue()>=80)
			{
				map1.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()<80&&entry.getValue()>=70)
			{
				map1.put(entry.getKey(),"Bronze");
			}
			else
				map1.put(entry.getKey(),"No medal");
				
		}
	
		return map1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("shivam",91);
		map.put("parnav",89);
		map.put("bittu",79);
		map.put("amardeep",69);
		HashMap<String, String> map1;
		map1=getStudents  (map);
		for(Entry<String, String> entry:map1.entrySet())
		{
			System.out.println(entry.getKey()+" " +entry.getValue());
		}

	}

}
