package com.lab1.exercise1;

import java.util.Scanner;

public class FinalClass {
	public static void main(String ar[])
		{
		int naturalNumber;
		Scanner sc=new Scanner(System.in);
		naturalNumber=sc.nextInt();
		SumClass sum=new SumClass();
		int Sum= sum.calculateSum(naturalNumber);
		System.out.println(Sum);
		
		}

}
