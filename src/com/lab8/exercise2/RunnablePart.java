package com.lab8.exercise2;

import java.time.LocalDate;
import java.time.LocalTime;

public class RunnablePart implements Runnable {

	 //int timercount=0;
	@Override
	public void run() {
		LocalTime myObj = LocalTime.now();
		   while(true)//while(timercount!=10)
		{
				try {
					//System.out.println("Countdown: "+ timercount);
					System.out.println("Time: "+ myObj);
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*finally {
					timercount++;
					
				 if(timercount==10)
				     timercount=0;
				}*/
			
		  
		   
		}
		 
		
		
		
	}
	public static void main(String ar[])
	{
		
		RunnablePart rp=new RunnablePart();
		Thread t=new Thread(rp);
		t.start();
	}
	

}
