package edu.pragmatic.genericsandcollections.examples.collections;

public enum Color {
	SPADE("\u2660"), HEART("\u2661"),DIAMOND("\u2662"), CLUB("\u2667"), 
	;
	
	private Color(String code) {
		this.code = code;
	}
	private String code;
	
	@Override
	public String toString() {
		return code;
	}
}
