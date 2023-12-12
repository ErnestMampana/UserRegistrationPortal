package za.co.userportal.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import za.co.userportal.controller.RegistrationController;
import za.co.userportal.dao.UserRegistrationRequest;

@WebService
public class UserRegistrationService {
	
	RegistrationController rc = new RegistrationController();
	
	@WebMethod
	public String saveUser(UserRegistrationRequest request) {
		String response = "Success";
		rc.userRegistration(request);
		return response;
	}

}
