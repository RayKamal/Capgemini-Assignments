package com.lab3.exercise3;

import java.util.Scanner;

public class FinalClass {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int intInteger[];
		int n;
		System.out.println("no of element : " );
		n=sc.nextInt();
		intInteger=new int[n];
		for(int i=0;i<n;i++)
		{
			intInteger[i]=sc.nextInt();
		}
		System.out.println( "display integer array");
		for(int i=0;i<n;i++)
		{
			System.out.println( intInteger[i]);
		}
		System.out.print( "\n");
		ReverseSort rs=new ReverseSort();
		
		
		 rs.getSorted(intInteger);
		 rs.displaySortArray(intInteger);
	}

	

}
