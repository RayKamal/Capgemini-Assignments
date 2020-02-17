package com.lab8.exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrograme {
	public static void main(String ar[])
	{
		BufferedReader bufferreader = null;
		FileWriter filewriter = null;
		try {
			bufferreader = new BufferedReader(new FileReader("source.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			filewriter = new FileWriter("target.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CopyDataThread cdt=new CopyDataThread (bufferreader,filewriter);
		cdt.start();
		
	}

}
