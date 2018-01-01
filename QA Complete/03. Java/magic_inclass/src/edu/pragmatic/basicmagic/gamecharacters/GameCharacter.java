package edu.pragmatic.basicmagic.gamecharacters;

public interface GameCharacter {

	Integer MIN_ATTACK_DAMAGE = 1;
	
	int getAttack();
	void takeDamage(int damage);
	double getHealth();
	boolean isAlive();
	
}
