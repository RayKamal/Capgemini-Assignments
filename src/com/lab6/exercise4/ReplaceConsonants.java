package com.lab6.exercise4;

import java.util.Scanner;

public class ReplaceConsonants {
	
	public static String alterString(String value)
	{
		StringBuilder sb=new StringBuilder(); 
		char ch;
		int valueloop;
		for(valueloop=0;valueloop<value.length();valueloop++)
		{
			 ch=value.charAt(valueloop);	
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			  {
				  sb.append(ch);
			  }
			  else
			  {
		          ch=(char) (ch+1);
		           sb.append(ch);
			    //System.out.println(ch); 
			  
			  }
			  
		}
		value=sb.toString();
		return value;
		
	}
	
	public static void main(String ar[])
	{
		String stringValue;
		Scanner sc=new Scanner(System.in);
		stringValue=sc.next();
		System.out.println(alterString(stringValue ));
	}

}
