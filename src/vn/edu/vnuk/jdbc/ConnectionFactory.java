package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			/*
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/vnuk", 
					"root", 
					System.getenv("DB_PWD")
				);
			*/
			
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/vnuk", 
					"root", 
					"PER180H"
				);
		}
		
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
