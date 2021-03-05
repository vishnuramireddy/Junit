package service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A test class has - One @BeforeEach method - before() - One @Test method -
 * t1() - t2() - One @AfterEach method - after()
 * 
 * O/p: ---- Before is called T1 is called after is called
 * 
 * Before is called T2 is called after is called
 * 
 * 
 * Order of execution: ---------------------- before() t1() after()
 * 
 * 
 * before() t2() after()
 * 
 */

public class TestAnnotations2 {

	@BeforeEach
	public void before() {
		System.out.println("Before is called");
	}

	@Test
	public void t1() {
		System.out.println("T1 is called");
	}

	@Test
	public void t2() {
		System.out.println("T2 is called");
	}

	@AfterEach
	public void after() {
		System.out.println("after is called");
	}

}