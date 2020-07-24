package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		
		fos.write(5);
		
		System.out.println("Data is saved ");
		
	}

}
