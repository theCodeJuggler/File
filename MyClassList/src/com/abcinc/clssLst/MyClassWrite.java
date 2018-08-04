package com.abcinc.clssLst;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MyClassWrite {

	public static void main(String args[])
	{
		//declaring the list objects
		List<MyClass> objList = new ArrayList<>();
		
		objList.add(new MyClass("SSB0011",15));
		objList.add(new MyClass("SB0011",2000));
		objList.add(new MyClass("SSB0012",21000));
		objList.add(new MyClass("SB0012",30000));
		objList.add(new MyClass("SSB0014",21000));
		
		try(FileOutputStream fos = new FileOutputStream("objects.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			objList.stream().forEach((myClass) -> {
				try {
					oos.writeObject(objList);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			System.out.println("Successful Serialized");	//message of successful write file  
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
