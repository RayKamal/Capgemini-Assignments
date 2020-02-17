package com.lab7.exercise8;

public class Final {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {1,2,2,3,4,5,6,1,2,3,4,5};
		ModifyClass modifyclass=new ModifyClass();
		int intwithoutDuplacte[]=modifyclass.getSquarenumber(intArray);
		for(int i=0;i<intwithoutDuplacte.length;i++)
		{
			System.out.println(intwithoutDuplacte[i]);
		}
		
	}

}
