package edu.pragmatic.lecture9.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		String sourcePath = "/Users/milenpenchev/temp/a.txt";
		MyReader reader = new MyReader();
		
		String content = null;
		try {
			content = reader.read(sourcePath);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String targetPath = "/Users/milenpenchev/temp/b.txt";
		MyWriter writer = new MyWriter();
		try {
			writer.write(targetPath, new StringBuilder(content).reverse().toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
