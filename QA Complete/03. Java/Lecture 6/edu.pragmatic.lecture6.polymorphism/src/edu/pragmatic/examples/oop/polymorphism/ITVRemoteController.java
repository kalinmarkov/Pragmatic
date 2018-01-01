package edu.pragmatic.examples.oop.polymorphism;

public interface ITVRemoteController {
	void startTV();
	void stopTV();
	void channelUp();
	void channerDown();
	void goToChannel(int newChannel);
}
