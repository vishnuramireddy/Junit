package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestController {

	Service service;
	Controller controller;
	Person p;

	@Before
	public void before() {
		controller = new Controller();
		service = Mockito.mock(Service.class);
		controller.setService(service);

		p = new Person("user1", 19, "hyderabad", "admin", null, null);
	}

	@Test
	public void t1InvalidAccess() throws ServiceException {
		// prepare
		p.setAccess("admin123");

		// call the method
		String msg = controller.process(p);

		// verify msg
		Assert.assertEquals("invalid access", msg);

		// verify method not called
		Mockito.verify(service, Mockito.times(0)).processRegistration(Mockito.eq(p));

	}

	@Test
	public void t2ValidAccesAndValidReg() throws ServiceException {
		// prepare
		p.setAccess("admin");
		Mockito.when(service.processRegistration(Mockito.eq(p))).thenReturn(true);

		// call the method
		String msg = controller.process(p);

		Assert.assertEquals("success", msg);
		// verify method is called 1 time
		Mockito.verify(service, Mockito.times(1)).processRegistration(Mockito.eq(p));

	}

	@Test
	public void t2ValidAccesAndInValidReg() throws ServiceException {
		// prepare
		p.setAccess("admin");
		Mockito.when(service.processRegistration(Mockito.eq(p))).thenReturn(false);

		// call the method
		String msg = controller.process(p);

		Assert.assertEquals("fail", msg);
		// verify method is called 1 time
		Mockito.verify(service, Mockito.times(1)).processRegistration(Mockito.eq(p));

	}

	@Test
	public void t2ValidAccesAndRegException() throws ServiceException {
		// prepare
		p.setAccess("admin");
		Mockito.when(service.processRegistration(Mockito.eq(p))).thenThrow(new ServiceException("invalid data"));

		// call the method
		String msg = controller.process(p);

		Assert.assertEquals("invalid data", msg);
		// verify method is called 1 time
		Mockito.verify(service, Mockito.times(1)).processRegistration(Mockito.eq(p));

	}

}