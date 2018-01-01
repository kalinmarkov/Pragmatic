package edu.pragmatic.lecture8.exceptions;

import java.io.IOException;

public class ExceptionHandler {
	public static void main(String[] args) {
		ExceptionThrower et = new ExceptionThrower();

		System.out.println(1);
		try {
			et.doSomething();
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(3);
		} finally {
			System.out.println(4);
		}

		System.out.println(5);

		try {
			et.readSomething();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
