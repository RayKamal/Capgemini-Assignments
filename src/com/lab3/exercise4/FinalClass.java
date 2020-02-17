package com.lab3.exercise4;

import java.util.Scanner;

public class FinalClass {
 public static void main(String ar[])
 {
	    char charArray[];
	    Scanner sc=new Scanner(System.in);
		charArray = sc.next().toCharArray();
		System.out.println("display :- ");
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		System.out.print("\n");
		OccurenceClass oc= new OccurenceClass(charArray);
		oc. countCharOccurence();
 }
}
