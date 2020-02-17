package com.lab6.exercise6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataPrint {
	public static void main(String[] args)
	{
		File file=new File("source.txt");
		int count=0;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String stringName;
			String line="";
			int r =0;
			try {
				while((stringName=br.readLine())!=null)
				{
					count++;
					line+=stringName+" ";
				}
				System.out.println("No. of lines in file: "+count);
				String[]strchar=line.split(" ");
				System.out.println("No. of words in file: "+ (strchar.length));
				for(int i=0;i<strchar.length;i++)
				{
					r+=strchar[i].length();
				}
				System.out.println("No. of characters in file: "+ r);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
