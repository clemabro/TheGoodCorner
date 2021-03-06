package org.cesi.GoodCorner.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBDD {

	static private String ip = "90.105.222.233:3306";
	static private String user = "madera";
	static private String password = "M@deraDev";
	static private Connection connect;

	/**
	 * Establish the connection with the database
	 * @return A connection to the database
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static Connection getInstance() {
		
		if (connect == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect = DriverManager.getConnection("jdbc:mysql://" + ip + "/good_corner?" +
					                                   "user=" + user + "&password=" + password + "&serverTimezone=UTC");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return connect;
	}
}

