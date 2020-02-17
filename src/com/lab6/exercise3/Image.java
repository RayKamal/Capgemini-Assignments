package com.lab6.exercise3;

import java.util.Scanner;

public class Image {
	public static String getImage(String stringValue )
	{
		StringBuilder inputString = new StringBuilder();
		inputString.append(stringValue);
		inputString.reverse();
		stringValue+="|";
		stringValue+=inputString.toString();
		
		return stringValue;
	
	}
	
	public static void main(String ar []) {
		String stringValue;
		Scanner sc=new Scanner(System.in);
		stringValue=sc.next();
		System.out.println(getImage(stringValue ));
		
	}

}
