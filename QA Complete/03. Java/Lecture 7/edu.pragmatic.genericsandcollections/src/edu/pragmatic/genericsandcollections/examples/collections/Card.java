package edu.pragmatic.genericsandcollections.examples.collections;

public class Card {
	
	private Color color ;
	private Rank rank;

	public Card(Rank rank, Color color) {
		this.color = color;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return color.toString() + rank.toString();
	}
}
