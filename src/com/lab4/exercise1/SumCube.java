package com.lab4.exercise1;

public class SumCube {
	int Number;
	int RangeLoop = 0;
	int Sum=0;

	public SumCube(int naturalNumber) {
		// TODO Auto-generated constructor stub
		Number=naturalNumber;
	}
	
	public int cubeSum() {
		for(RangeLoop=1;RangeLoop<=Number;RangeLoop++)
		{
			Sum+=RangeLoop*RangeLoop*RangeLoop;
		}
		
		
		return Sum;
		
	}

}
