package edu.pragmatic.lecture8.exceptions;

import java.io.IOException;

public class GeneralForm {

	public void throwNewCustomException() throws CustomException {
		
	}
	
	public void throwNewIOException() throws IOException {
		
	}
	
	public void throwNewIllegalArgumentException() throws IllegalArgumentException {
		
	}
	
	public static void main(String[] args) {
		GeneralForm _this = new GeneralForm();
		
		try {
			System.out.println("In try statement");
			return ;
//			_this.throwNewCustomException();
//			_this.throwNewIllegalArgumentException(); // this is a runtime exception
//			_this.throwNewIOException();
//		} catch (CustomException | IOException  e ) {
//			// handle exception here
//		
		}finally{
			System.out.println("This is always performed");
		}
		
	}
	
}
