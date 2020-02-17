package com.lab5.exercise2;

import java.util.Scanner;

public class FinalClass {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); //nth term value;
	int num;
	num=n;
	FibonacciClass s=new FibonacciClass(n);
	System.out.println(s.recfibbonicSeries(num=num-2));
	//s.fibbonicSeries();
}


}
