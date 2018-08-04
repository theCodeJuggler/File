package in.co.abcinc.emp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpWrite {

	public static void main(String[] args)
	{
		Employee emp = new Employee("101", "Satyen", 50_000);	//creating object
		
		//writing to file
		try(FileOutputStream fos = new FileOutputStream("employee.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(emp);
			
			System.out.println("Written To File");
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
