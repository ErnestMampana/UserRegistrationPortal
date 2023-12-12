package za.co.userportal.sqlOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import za.co.userportal.dao.UserRegistrationRequest;

public class SqlUserRepository {
	private static final Logger logger = Logger.getLogger(SqlUserRepository.class.getName());

	Connection connection = MySqlConnection.getConnection();

	public void saveUser(UserRegistrationRequest request) {
		try {
			String checkQuery = "select * from users where idNumber=?";
			PreparedStatement psc = connection.prepareStatement(checkQuery);
			psc.setString(1, request.getIdNumber());
			ResultSet rs = psc.executeQuery();

			if (!rs.next()) {
				String query = "insert into users(idNumber,firstName,lastName,houseNumber,streetName,town,postalCode) values(?,?,?,?,?,?,?)";
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, request.getIdNumber());
				ps.setString(2, request.getFirstname());
				ps.setString(3, request.getLastname());
				ps.setInt(4, request.getHouseNumber());
				ps.setString(5, request.getStreetName());
				ps.setString(6, request.getTown());
				ps.setString(7, request.getPostalCode());

				ps.executeUpdate();

				connection.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
