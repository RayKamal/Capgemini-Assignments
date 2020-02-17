package com.lab3.exercise2;

import java.util.Scanner;

public class FinalClass {
	
	public static void main(String ar[])
	{
		int n;
		char charArray[];
		Scanner sc=new Scanner(System.in);
		charArray = sc.next().toCharArray();
		System.out.println("display :- ");
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		System.out.print("\n");
		StringArray sa=new StringArray();
		sa.upperCaseLowerCase(charArray);
		System.out.println("After operation :- ");
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
	}

}
