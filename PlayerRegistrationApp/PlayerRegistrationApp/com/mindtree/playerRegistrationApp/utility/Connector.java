package com.mindtree.playerRegistrationApp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.playerRegistrationApp.exception.Myexception;



public class Connector {

	public Connection getConnector() throws Myexception {
		Connection connect= null;
		final String url="jdbc:mysql://localhost:3306/players";
		final String user="root";
		final String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
		throw new Myexception("The exception has occured while Connection");
		}
		
		return connect;
		
	}

}
