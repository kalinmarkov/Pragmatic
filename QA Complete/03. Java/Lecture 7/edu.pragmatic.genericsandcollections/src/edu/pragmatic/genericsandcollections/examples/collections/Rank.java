package edu.pragmatic.genericsandcollections.examples.collections;

public enum Rank {
	ONE("1"), TWO("2"), TREE("3"), FOUR("4"), 
	FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), 
	NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A")
	;
	private String rank;
	
	private Rank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return rank;
	}

}
