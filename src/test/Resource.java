package test;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resource {
	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Tayyaba\\Documents.txt")))
		{
			String str;
			
		    while((str=br.readLine())!=null)
		    {
		    	System.out.println(str);
		    }
		    
		}
		catch(IOException ie)
		{
			System.out.println("I/O Exception" +ie);
		}

	}

}



