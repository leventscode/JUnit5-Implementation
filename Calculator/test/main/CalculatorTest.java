package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	public void initEach(TestInfo testInfo) {
		String methodName = testInfo.getTestMethod().get().getName();
		System.out.print(methodName + "\n");
	}

	@AfterEach
	public void afterEach() {
		System.out.println();
	}

	/**
	 * Special assertEquals method. Prints the console " + passed" or " - failed"
	 */
	void calcAssertEquals(double expected, double result) {
		try {
			assertEquals(expected, result);
			System.out.println(" + passed");
		} catch (AssertionError e) {
			System.out.println(" - failed");
			throw e;
		}
	}

	@Test
	void testAdd() {
		double expected = 5.0;
		double result = Calculator.add(3, 2);
		calcAssertEquals(expected, result);
	}

	@Test
	void testSubtract() {
		double expected = -1.0;
		double result = Calculator.subtract(2, 3);
		calcAssertEquals(expected, result);
	}

	@Test
	void testMultiply() {
		double expected = 6.0;
		double result = Calculator.multiply(3, 2);
		calcAssertEquals(expected, result);
	}

	@Test
	void testDivide() {
		double expected = 1.5;
		double result = Calculator.divide(3, 2);
		calcAssertEquals(expected, result);
	}

}