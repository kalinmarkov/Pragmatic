package edu.pragmatic.basicmagic.gamecharacters;

public class Magus implements GameCharacter{

	private int age;
	private String name;
	private double health = 100D;
	private int gold ;
	private int damage;
	
	public Magus(String name, int age, int gold, int damage) {
		this.name = name;
		this.age = age;
		this.gold = gold;
		this.damage = damage;
	}
	
	public int getGold() {
		return gold;
	}

	public void pays(int price) {
		gold -= price;
		System.out.println("[Sytem] Magus " + name 
				+ " now has " + gold);
	}
	
	public int getAttack() {
		return damage;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHealth() {
		return health;
	}
	
	public void heal(double percent) {
		health += percent;
	}
	
	public void takeDamage(int damage) {
		health -= damage;
	}
	
	public boolean isAlive() {
		return health > 0D; 
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("name: %s , age: %d , health: %.2f, gold=%d", 
				getName(), getAge(), getHealth(), getGold());
	}
	
}
