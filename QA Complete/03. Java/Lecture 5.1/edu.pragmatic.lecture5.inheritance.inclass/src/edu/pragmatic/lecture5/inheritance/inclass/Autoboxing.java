package edu.pragmatic.lecture5.inheritance.inclass;

public class Autoboxing {
	
	void print(char num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Autoboxing boxing = new Autoboxing();
		Character instanceNum = '6';
		boxing.print(instanceNum); 
		boxing.print(instanceNum.charValue());
	}
	
	
	
	

}
