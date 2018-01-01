package edu.pragmatic.lecture9.enums;

public enum Deck {

	ONE("one"), // 1
	TWO("two"), // 2
	THREE("three"), // 3
	JACK("jack"), // 4
	QUEEN("queen"), // 5
	KING("king"), // 6
	ACE("ace") // 7
	;
	
	private String text;
	
	Deck(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return getText();
	}
}
