package edu.pragmatic.lecture9.enums;

public enum Months {
	JANUARY("january"),
	FEBRUARY("february"),
	MARCH("march"),
	APRIL("april"),
	MAY("may"),
	JUNE("june"),
	JULY("july"),
	AUGUST("august"),
	SEPTEMBER("september"),
	OCTOBER("october"),
	NOVEMBER("november"),
	DECEMBER("december");

	private Months(String month) {
		this.month = month;
	}

	private String month;

	public String getMonth() {
		return month;
	}
	
	public static Months getInstance(String month) {
		for (Months currentMonth: values()) {
			if (currentMonth.getMonth().equalsIgnoreCase(month)) {
				return currentMonth;
			}
		}
		
		return null;
	}
	
}
