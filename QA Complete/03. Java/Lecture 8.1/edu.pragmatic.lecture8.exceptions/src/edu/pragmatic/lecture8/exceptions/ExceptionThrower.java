package edu.pragmatic.lecture8.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionThrower {

	public void doSomething() throws Exception {
		System.out.println("alabala");

		Exception e = new Exception("Ooops");
		throw e;
	}

	public void readSomething() throws IOException {
		File f = new File("C:/tmp/missing.txt");
		f.createNewFile();
	}
}
