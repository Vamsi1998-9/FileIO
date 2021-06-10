package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
	 
	
	public static void main(String[] args) {
		FileOutputStream fs= null;
		
		Student s= new Student(123, "Saket", "Prem Nagar");
		
		try {
			fs = new FileOutputStream("Student.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s);
			
			System.out.println(s+"\n"+"Object returned");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
