package com.lab5.exercise2;

public class FibonacciClass {
	int loopvalue;
	int series[];
	int number;
	int n1=1;
	int n2=1;
	int nthValue = 0;
	FibonacciClass(int n){
		number=n;
		series=new int[n];
		
	}
	public  void fibbonicSeries()
	{
		series[0]=1;
		series[1]=1;
		
		for( loopvalue=2;loopvalue<number;loopvalue++)
		{
			  
			series[loopvalue]=series[loopvalue-1]+series[loopvalue-2];
			  
		}
		System.out.println(series[number-1]);
		
	}
	
	public int recfibbonicSeries(int num)
	{
		
		if(num==0)
			return nthValue;
		nthValue=n1+n2;
		n1=n2;
		n2=nthValue;
		return recfibbonicSeries(num=num-1);
			
	}

}
