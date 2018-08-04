package in.com.abcinc.fileOp;

import java.io.*;

public class FileExist {

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//user input
		System.out.println("Enter the file destination");
		String path=in.readLine();

		//creating file object
		File file=new File(path);

		//checking the presence
		if(file.exists() && !file.isDirectory())
			System.out.println("File do exist at that path");
		else 
			System.out.println("File do not exist");
	}

}
