package za.co.userportal.controller;

import za.co.userportal.dao.UserRegistrationRequest;
import za.co.userportal.services.UserRegistrationService;

public class Main {

	public static void main(String[] args) {
		
		UserRegistrationService service = new UserRegistrationService();
		UserRegistrationRequest request = new UserRegistrationRequest();
		
		request.setFirstname("Ernest");
		request.setLastname("Mohlala");
		request.setIdNumber("9212065574081");
		request.setHouseNumber(85);
		request.setPostalCode("1632");
		request.setTown("Kempton Park");
		request.setStreetName("Mehlulo");
		
		service.saveUser(request);

	}

}
