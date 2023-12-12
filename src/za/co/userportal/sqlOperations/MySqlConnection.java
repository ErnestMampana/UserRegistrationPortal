package za.co.userportal.sqlOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class MySqlConnection {
	private static final Logger logger = Logger.getLogger(MySqlConnection.class.getName());

	private static Connection connection;

	public static Connection getConnection() {
		try {
			logger.info("Establishing sql connection");
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsdlusers", "root", "12345");
			logger.info("connection established");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
