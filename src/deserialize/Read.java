package deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialize.Student;

public class Read {

		public static void main(String[] args) {
			FileInputStream fis = null;
			ObjectInputStream ois= null;
			
			Student s = null;
			
			try {
				fis = new FileInputStream("Student.txt");
				ois = new ObjectInputStream(fis);
				
				s = (Student) ois.readObject();
 			} catch (FileNotFoundException e) {
				// TODO: handle exception
 				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println(s);
 		}
}
