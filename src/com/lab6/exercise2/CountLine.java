package com.lab6.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLine {
	public static void main(String ar[]) {
	File file =new File("source.txt");
	try {
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String stringdata;
		int cnt=1;
		try {
			while((stringdata=br.readLine()) != null)
			{
				System.out.println(cnt++ +" "+stringdata);
			}
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

