package com.abcinc.fileOp.line;

import java.io.*;
public class LineCount {

	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//user input
		System.out.println("Enter file path");
		String path = in.readLine();

		File file = new File(path);				//file object
		FileReader fileRead = new FileReader(path);//file reader stream creating

		if(file.exists() && !file.isDirectory())
		{
			LineNumberReader lineRead = new LineNumberReader(fileRead);	//line reader object
			while(lineRead.readLine() != null);	//traversing until encountering end of file

			System.out.println("Number of lines in file :: "+lineRead.getLineNumber());
			
			lineRead.close();
		}
		else
		{
			System.out.println("File does not exist");
		}
		
		//closing reader stream
		fileRead.close();
	}
}
