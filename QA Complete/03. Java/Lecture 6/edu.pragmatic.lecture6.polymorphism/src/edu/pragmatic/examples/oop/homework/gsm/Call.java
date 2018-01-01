package edu.pragmatic.examples.oop.homework.gsm;

public class Call {
	public static final double MIN_CALL_DURATION = 0;
	public static final double MAX_CALL_DURATION = 120;
	
	private static double priceForAMinute;
	
	private GSM caller;
	private GSM receiver;
	private double duration;
	
	public Call(GSM caller, GSM receiver, double duration) {
		setCaller(caller);
		setReceiver(receiver);
		setDuration(duration);
	}
	
	public static double getPriceForAMinute() {
		return priceForAMinute;
	}
	public static void setPriceForAMinute(double priceForAMinute) {
		Call.priceForAMinute = priceForAMinute;
	}
	
	public GSM getCaller() {
		return caller;
	}
	public void setCaller(GSM caller) {
		if(caller == null) {
			System.out.println("Please enter caller!");
			return;
		}
		this.caller = caller;
	}
	
	public GSM getReceiver() {
		return receiver;
	}
	public void setReceiver(GSM receiver) {
		if(receiver == null) {
			System.out.println("Please enter receiver!");
			return;
		}
		this.receiver = receiver;
	}
	
	public static boolean checkCallDuration(double duration) {
		if(duration <= MIN_CALL_DURATION || duration > MAX_CALL_DURATION) {
			return false;
		}
		return true;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		if(checkCallDuration(duration)) {
			this.duration = duration;
		}else{
			System.out.println("Wrong duration!");
		}
	}
	
	public String toString() {
		return "duration: " + duration + "caller " + caller.getSimMobileNumber();
	}
	
}
