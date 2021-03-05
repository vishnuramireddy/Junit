package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestServiceAddEntry2 {

	Service service;

	@Before
	public void before() {
		service = new Service();
	}

	@Test
	public void testWithNull() {
		service.addEntry(null);

		Assert.assertEquals(service.names.size(), 0);
	}

	@Test
	public void testWithEmpty() {
		service.addEntry("");
		Assert.assertEquals(service.names.size(), 0);
	}

	@Test
	public void testWithValue() {
		service.addEntry("Hello");
		Assert.assertEquals(service.names.size(), 1);

		Assert.assertEquals(service.names.get(0), "Hello");
	}

}
