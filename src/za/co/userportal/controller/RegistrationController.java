package za.co.userportal.controller;

import za.co.userportal.dao.UserRegistrationRequest;
import za.co.userportal.dao.UserRegistrationResponse;
import za.co.userportal.sqlOperations.SqlUserRepository;

public class RegistrationController {

	public UserRegistrationResponse userRegistration(UserRegistrationRequest request) {
		UserRegistrationResponse response = new UserRegistrationResponse();
		SqlUserRepository repository = new SqlUserRepository();
		
		if (request.getIdNumber() != null) {
			repository.saveUser(request);
		}
		return response;
	}

}
