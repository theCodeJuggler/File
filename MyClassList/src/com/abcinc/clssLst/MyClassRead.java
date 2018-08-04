package com.abcinc.clssLst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MyClassRead {

	public static void main(String args[]) 
	{

		List<MyClass> objList = new ArrayList<>();		//defining the arraylist

		//reading from file
		try(FileInputStream fis = new FileInputStream("objects.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			objList = (List)ois.readObject();
			objList.stream().forEach(System.out::println);
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
}
