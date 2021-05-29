package com.mindtree.playerRegistrationApp.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.playerRegistrationApp.exception.Myexception;

public class ClosingResources {
	
	
	public void closeConnection(ResultSet resultSet ) throws Myexception {
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				throw new Myexception("The exception has occured in resultset");
				
			}
		}
	}
	public void closeConnection(Connection connection ) throws Myexception {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new Myexception("The exception has occured in resultset");
				
			}
		}
	}
	public void closeConnection(Statement statement ) throws Myexception {
		if(statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new Myexception("The exception has occured in resultset");
				
			}
		}
	}
	

}
