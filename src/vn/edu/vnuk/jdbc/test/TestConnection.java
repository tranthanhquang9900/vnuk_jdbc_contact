package vn.edu.vnuk.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import vn.edu.vnuk.jdbc.ConnectionFactory;

public class TestConnection {
	
	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Connection is open!");
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
