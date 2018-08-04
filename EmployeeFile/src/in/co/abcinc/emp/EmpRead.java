package in.co.abcinc.emp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//driver program to test the implement
public class EmpRead {

	public static void main(String[] args) 
	{
		
		//reading to the file
		try(FileInputStream fos = new FileInputStream("employee.txt");
				ObjectInputStream oos = new ObjectInputStream(fos)) {
			
			Employee emp = (Employee) oos.readObject();
			
			//displaying the outputs
			System.out.println(emp);
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
