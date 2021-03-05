package service;

public class Controller {

	Service service;

	public String process(Person p) throws ServiceException {
		if (!p.getAccess().equals("admin"))
			return "invalid access";

		boolean regStatus = false;

		try {
			regStatus = service.processRegistration(p);
		} catch (ServiceException exception) {
			return exception.getErr();
		}

		if (regStatus)
			return "success";
		else
			return "fail";
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}