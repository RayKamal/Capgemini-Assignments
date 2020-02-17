package com.lab1.exercise3;

import java.util.Scanner;

import com.lab1.exercise2.DifferenceClass;

public class FinalClass {
	public static void main(String ar[])
	{
	int Number;
	Scanner sc=new Scanner(System.in);
	Number=sc.nextInt();
	NumberClass sum=new NumberClass(Number);
	boolean result= sum.checkNumber();
	System.out.println(result);
	
	}
}
