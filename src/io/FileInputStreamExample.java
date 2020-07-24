package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("../java-practical/src/abc.txt");
		int data;
	       while((data= file.read()) != -1) {
		System.out.print((char)data);
	   }
	}

}
