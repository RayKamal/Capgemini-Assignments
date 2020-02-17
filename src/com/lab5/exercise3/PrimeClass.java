package com.lab5.exercise3;

public class PrimeClass {

	int Number;
	int LoopValue=0,LoopValue1=0;
	int flag;
	public PrimeClass(int number) {
		Number=number;
	}
	
	public void primeNumberInRange()
	{
		for(LoopValue=2;LoopValue<=Number;LoopValue++)
		{
			flag=1;
			for(LoopValue1=2;LoopValue1<=LoopValue/2;LoopValue1++ )
			{
				if(LoopValue%LoopValue1==0)
				{
					flag = 0; 
	                break; 
				}
			}
			if(flag==1)
				System.out.println(LoopValue);
		}
	}

}
