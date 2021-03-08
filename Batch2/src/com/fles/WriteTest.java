package com.fles;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class WriteTest {
	
	public static void main(String[] args) throws Exception
	{
		
		//File f = new File("src/write.txt");
		
		FileOutputStream out = new FileOutputStream("src/write.txt");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		String msg = "file handling examples using byte stream";
		
		out.write(msg.getBytes());
		
		System.out.println("Done.");
		
		out.close();
	}

}
