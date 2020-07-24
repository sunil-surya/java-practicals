package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StaticFileCopyExample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fileInputStream = new FileInputStream("../java-practical/src/abc.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream("bbc.txt");
		
		int data;
		while((data =fileInputStream.read()) != -1) {
			fileOutputStream.write(data);
		}
		
	}

}
