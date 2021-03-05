package service;

import org.junit.Test;

public class TestServiceAddEntry {

	Service service = new Service();

	@Test
	public void testWithNull() {
		service.addEntry(null);
	}

	@Test
	public void testWithEmpty() {
		service.addEntry("");
	}

	@Test
	public void testWithValue() {
		service.addEntry("Hello");
	}

}
