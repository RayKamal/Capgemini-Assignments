package com.lab1.exercise2;

import java.util.Scanner;

import com.lab1.exercise1.SumClass;

public class FinalClass {
	public static void main(String ar[])
	{
	int naturalNumber;
	Scanner sc=new Scanner(System.in);
	naturalNumber=sc.nextInt();
	DifferenceClass sum=new DifferenceClass();
	int Sum= sum.calculateDifference(naturalNumber);
	System.out.println(Sum);
	
	}

}
