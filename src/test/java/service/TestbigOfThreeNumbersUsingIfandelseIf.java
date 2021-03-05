package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestbigOfThreeNumbersUsingIfandelseIf {

	bigOfThreeNumbersUsingIfandelseIf bt1 = new bigOfThreeNumbersUsingIfandelseIf();

	@Test
	public void big() {

		int n1 = 10;
		int n2 = 20;
		int n3 = 40;

		int ExpetedOutput = 40;

		int actualOutput = bt1.bt(n1, n2, n3);

		Assertions.assertEquals(ExpetedOutput, actualOutput, "Invalid");

	}

	@Test
	public void big1() {

		int n1 = 10;
		int n2 = 40;
		int n3 = 20;

		int ExpetedOutput = 40;

		int actualOutput = bt1.bt(n1, n2, n3);

		Assertions.assertEquals(ExpetedOutput, actualOutput, "Invalid");

	}

	@Test
	public void big2() {

		int n1 = 40;
		int n2 = 10;
		int n3 = 20;

		int ExpetedOutput = 40;

		int actualOutput = bt1.bt(n1, n2, n3);

		Assertions.assertEquals(ExpetedOutput, actualOutput, "Invalid");

	}

	@Test
	public void big3() {

		int n1 = 40;
		int n2 = 10;
		int n3 = 40;

		int ExpetedOutput = 40;

		int actualOutput = bt1.bt(n1, n2, n3);

		Assertions.assertEquals(ExpetedOutput, actualOutput, "Invalid");

	}

}
