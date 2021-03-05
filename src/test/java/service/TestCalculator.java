package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
// write the test cases for every function in Calculator

	Calculator cal = new Calculator();

	@Test
	public void testSum() {
		// 1.Prepare test data
		int n1 = 20;
		int n2 = 40;

		int expectedOutput = 60;

		// 2.call the method
		int actualOutput = cal.sum(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid operation");
	}

	@Test
	public void testSumWithNegative() {
		// 1.Prepare test data
		int n1 = 40;
		int n2 = -10;

		int expectedOutput = 30;

		// 2.call the method
		int actualOutput = cal.sum(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid operation");
	}

	@Test
	public void testBig1() {
		// 1.Prepare test data
		int n1 = 20;
		int n2 = 40;
		int expectedOutput = 40;

		// 2.call the method
		int actualOutput = cal.big(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid Big Number");
	}

	@Test
	public void testBig2() {
		// 1.Prepare test data
		int n1 = 40;
		int n2 = 20;
		int expectedOutput = 40;

		// 2.call the method
		int actualOutput = cal.big(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid Big Number");
	}

	public int div(int a, int b) {
		if (b == 0)
			return 99999;
		return a / b;
	}

	@Test
	public void testDiv1() {
		// 1.Prepare test data
		int n1 = 60;
		int n2 = 20;

		int expectedOutput = 3;

		// 2.call the method
		int actualOutput = cal.div(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid div result");
	}

	@Test
	public void testDiv2() {
		// 1.Prepare test data
		int n1 = 60;
		int n2 = 0;

		int expectedOutput = 99999;

		// 2.call the method
		int actualOutput = cal.div(n1, n2);

		// 3.assert the results
		Assertions.assertEquals(expectedOutput, actualOutput, "Invalid div result");

	}

}