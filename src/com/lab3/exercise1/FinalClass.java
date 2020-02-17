package com.lab3.exercise1;

import java.util.Scanner;

public class FinalClass {

	public static void main(String ar[])
			{
		int n;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("no of element : " );
		n=sc.nextInt();
		int[] intInteger = new int[n];
		for(int i=0;i<n;i++)
		{
			intInteger[i]=sc.nextInt();
		}
		 IntArray ia=new  IntArray();
		 result=ia.getSecondSmallest(intInteger);
		 System.out.println("second smallest  element : "+ result );
		}
}
