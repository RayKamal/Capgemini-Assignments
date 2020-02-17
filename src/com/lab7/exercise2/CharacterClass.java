package com.lab7.exercise2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CharacterClass {
	public static HashMap<Character,Integer> countCharacter(char[] charArray)
	{
		int value;
		HashMap<Character,Integer> charCount=new LinkedHashMap<>();
		for(int charindex=0;charindex<charArray.length;charindex++)
		{
			
			if(charCount.containsKey(charArray[charindex]))
			{
				 value=charCount.get(charArray[charindex]);
				charCount.put(charArray[charindex],value+1);
			}	
			else
				charCount.put(charArray[charindex],1);
				
			
		}
		return charCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charArray[]= {'s','s','p','p','c','d','f','s','p'};
		HashMap<Character,Integer> charCount;
		charCount=countCharacter(charArray);
		for(Entry<Character, Integer> entry:charCount.entrySet())
		{
			System.out.println(entry.getKey()+" " +entry.getValue());
		}

	}

}
