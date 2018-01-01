package edu.pragmatic.examples.oop.polymorphism;

public interface IDVDRemoteController {
	void play();
	void stop();
	void insertDisc();
	void eject();
	
	void pause();
	
	public static final String BAR_CODE = "7894565313";
	
	boolean isBatteryDead();
}
