package com.lab8.exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	BufferedReader bufferreader;
	FileWriter filewriter;
	
	public CopyDataThread(BufferedReader bufferreader, FileWriter filewriter) {
		this.bufferreader=bufferreader;
		this.filewriter=filewriter;
		
	}

	public void run()
	{
		try {
			
			String st;
			while((st=bufferreader.readLine())!=null)
			{
				filewriter.write(st);
				String chararray[];
				int count=0;
				chararray=st.split("");
			    for(int i=0;i<chararray.length;i++)
			    {
			    	//System.out.println(arr[i]);
			    	count++;
			    	if(count==10)
				    {
				    	System.out.println("10 Characters are copied");
				    	sleep(5000);
				    	count=0;
				    }
			    	
			    }
			    
				filewriter.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
