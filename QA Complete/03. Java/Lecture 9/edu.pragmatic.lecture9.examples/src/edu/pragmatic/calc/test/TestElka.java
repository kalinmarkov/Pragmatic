package edu.pragmatic.calc.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.pragmatic.calc.Elka;

public class TestElka {

	private Elka elka ;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Calling before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Calling after class");
	}
	
	@Before
	public void init() {
		System.out.println("Calling init");
		elka = new Elka();
	}
	
	@After
	public void cleanUp() {
		System.out.println("Calling cleanUp");
	}
	
	@Test
	public void testSum_WitnNegativeNumbers() {
		System.out.println("testSum_WitnNegativeNumbers");
	}
	
	@Test
	public void testSum_WithPositiveNumbers() {
		int left = 5;
		int right = 6;
		int result = elka.sumOfPositiveNumbers(left, right);
		Assert.assertEquals(left + right, result);
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void testSum_WithANegativeNumber() {
		int left = -5;
		int right = 6;
		elka.sumOfPositiveNumbers(left, right);
	}
	
}
