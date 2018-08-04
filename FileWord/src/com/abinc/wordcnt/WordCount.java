package com.abinc.wordcnt;

import java.io.*;

public class WordCount {

	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//user input
		System.out.println("Enter The File");
		String path = in.readLine();
		
		//creating file object
		File file = new File(path);
		
		if(file.exists() && !file.isDirectory()) //checking existence of file
		{
			try
			{
				
				FileInputStream fln = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fln);
				BufferedReader br = new BufferedReader(isr);
				
				String line = br.readLine();	//initializing a line of file into the variable
				int wrdCnt = 0;	//counter
				String wrdArr[];
				
				//extracting each word from the sentence and inserting them to an array
				while(line != null)
				{
					wrdArr = line.split(" ");
					wrdCnt += wrdArr.length;
					line = br.readLine();
				}
				
				//displaying the word count
				System.out.println("Word Count :: "+wrdCnt);
				
				br.close();	//closing the stream
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Does not Exist !!");
		}
		
	}

}
