package Merge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFiles {
public static void main(String[] args) throws IOException {
		
		PrintWriter  pWriter = new PrintWriter("Destination.txt");// used to print 
		
		
		BufferedReader bReader1 = new BufferedReader(new FileReader("inputFile1.txt"));
		
		String line1 = bReader1.readLine();
		while(line1!=null)
		{
			pWriter.println(line1);
			line1 = bReader1.readLine();
		}
		pWriter.flush();
		System.out.println("Copied file 1 successfully");
		
		BufferedReader bReader2 = new BufferedReader(new FileReader("inputFile2.txt"));
			
		String line2 = bReader2.readLine();
		while(line2!=null)
		{
			pWriter.println(line2);
			line2 = bReader1.readLine();
		}
		
		pWriter.flush();
		System.out.println("copied file 2 successfully");
		pWriter.close();
		bReader1.close();
		bReader2.close();
		
			
	}
}
