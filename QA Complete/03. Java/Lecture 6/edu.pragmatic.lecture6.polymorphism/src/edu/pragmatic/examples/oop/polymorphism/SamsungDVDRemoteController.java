package edu.pragmatic.examples.oop.polymorphism;

public class SamsungDVDRemoteController implements IDVDRemoteController{

	@Override
	public void play() {
		System.out.println("Starting SAMSUNG DVD");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop SAMSUNG DVD");
		
	}

	@Override
	public void insertDisc() {
		System.out.println("Insert dvd");
	}

	@Override
	public void eject() {
		System.out.println("Eject dvd");		
	}

	@Override
	public boolean isBatteryDead() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

}
