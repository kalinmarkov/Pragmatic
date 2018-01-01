package edu.pragmatic.lecture9.enums;

import javax.swing.JOptionPane;

public class MonthsDemo {
	public static void main(String[] args) {
		Months someMonth = Months.APRIL;
		Months anotherMonth = Months.MAY;
		
		System.out.println(someMonth == anotherMonth);
		
		String newMonth = JOptionPane.showInputDialog("Моля въведете месец");
		
		Months realMonth = Months.getInstance(newMonth);
		if (realMonth == null) {
			JOptionPane.showMessageDialog(null, "Не сте въвели месец", "Алабала", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Въведохте " + realMonth.getMonth());
		}
	}
}