package edu.pragmatic.lecture9.unit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static final int NUMBER_1 = 10;
	private static final int NUMBER_2 = 5;
	

	private Calculator elka;
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	@Before
	public void setup() {
		elka = new Calculator(NUMBER_1, NUMBER_2);
		System.out.println("Before is executing");
	}
	
	@Test
	public void testSum() {
		int sum = elka.sum();
		System.out.println("testSum");
		assertEquals("Elkata ne moje da smqta", NUMBER_1 + NUMBER_2, sum);
	}
	
	@Test
	public void testDiff() {
		int diff = elka.diff();
		assertEquals("Elkata ne moje da smqta", NUMBER_1 - NUMBER_2, diff);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionByZero() {
		double divByZero = 10 / 0;
	}

	@After
	public void tearDown() {
		System.out.println("After is executing");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("afterAll");
	}
	
}
