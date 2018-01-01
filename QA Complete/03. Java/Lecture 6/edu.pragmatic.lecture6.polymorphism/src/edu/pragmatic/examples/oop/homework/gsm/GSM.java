package edu.pragmatic.examples.oop.homework.gsm;

public class GSM {
	private final String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	private double outgoingCallsDuration;
	
	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		this.simMobileNumber = simMobileNumber;
	}

	public GSM(String model) {
		this.model = model;
		hasSimCard = false;
	}
	
	public void insertSimCard(String simMobileNumber) {
		if(!simMobileNumber.startsWith("08") || simMobileNumber.length() != 10) {
			System.out.println("Enter valid number.");
			return;
		}
		this.simMobileNumber = simMobileNumber;
		hasSimCard = true;
	}
	
	public void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = "";
	}
	
	public void call(GSM receiver, double duration) {
		if(!checkIsPossibleCall(receiver, duration)){
			return;
		}
		
		//make the call
		Call call = new Call(this, receiver, duration);
		lastOutgoingCall = call;
		receiver.lastIncomingCall = call;
		
		outgoingCallsDuration += call.getDuration();
	}
	
	public double getSumForCalls(){
		return outgoingCallsDuration * Call.getPriceForAMinute();
	}
	
	public void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall == null) {
			System.out.println("No outgoing calls for gsm " + model);
			return;
		}
		
		System.out.println("Last outgoing call: ..." + lastOutgoingCall.toString());
	}
	
	
	private boolean checkIsPossibleCall(GSM g, double duration) {
		//checks if the call is valid
		if(Call.checkCallDuration(duration) == false) {
			System.out.println("Enter a valid duration.");
			return false;
		}
		
		if(this == g){
			System.out.println("Cannot call to the same gsm!");
			return false;
		}
		
		if(!hasSimCard || !g.hasSimCard){
			System.out.println("Both GSMs must have sim card inserted!");
			return false;
		}
		
		if(simMobileNumber.equals(g.simMobileNumber)) {
			System.out.println("Cannot call to the same number!");
			return false;
		}
		return true;
	}
}
