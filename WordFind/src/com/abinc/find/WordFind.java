package com.abinc.find;

import java.io.*;

public class WordFind {

	public static void main(String[] args) 
	{
		//storing inputs from command line
		String srchWrd = args[0];
		String path = args[1];
		
		File file = new File(path);	//creating file object
		
		//whether file exists in system
		if(file.exists() && !file.isDirectory())
		{
			
			try {
				FileInputStream fln = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fln);
				BufferedReader br = new BufferedReader(isr);
				
				String line = null;
				int lnCnt = 0, flag = 0;
				
				//iterating through the lines
				while((line = br.readLine()) != null)
				{
					lnCnt++;	//line counter
					
					//searching if line contains the word or not
					if (line.contains(srchWrd))
					{
						flag = 1;
						System.out.println(srchWrd+" is present in line number "+lnCnt);
					}
					
					//line = br.readLine();
				}
				
				if(flag == 0)
					System.out.println(srchWrd+" not Found");
				
				br.close();	//xlosing the file
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Does not Exist !!");
		}
	}

}
