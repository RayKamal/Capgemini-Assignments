package com.lab6.exercise5;

import java.util.Scanner;

public class Modify {
	public static int modifyNumber(int number)
	{
		String stringNumber= Integer.toString(number);
		StringBuilder sb=new StringBuilder();
		char ch1,ch2;
		int ch;
		//System.out.println(s);
		if (stringNumber.length()==1)
			return number;
		for(int i=0;i<stringNumber.length()-1;i++)
		{
			ch1=stringNumber.charAt(i+1);
			//System.out.println(ch1);
			ch2=stringNumber.charAt(i);
			//System.out.println(ch2);
			ch=((int) (ch1)-(int)(ch2));
			if(ch>0);
			else
				ch=ch*(-1);
			
			System.out.println(ch);
			 
			sb.append(ch);
			//System.out.println((char)(ch+48));
		}
		ch1=stringNumber.charAt(0);
		//System.out.println(ch1);
		ch2=stringNumber.charAt(stringNumber.length()-1);
		//System.out.println(ch2);
		ch=(int)(ch1)-(int)(ch2);
		if(ch>0);
		else
			ch=ch*(-1);
		System.out.println(ch);
		 
		sb.append(ch);
		stringNumber=sb.toString();
		number=Integer.parseInt(stringNumber);
	
		return number;
		
		
	}

	

	public static void main(String ar [])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(modifyNumber( number));
		
	}
}
