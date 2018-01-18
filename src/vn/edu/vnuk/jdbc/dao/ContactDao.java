package vn.edu.vnuk.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vn.edu.vnuk.jdbc.ConnectionFactory;
import vn.edu.vnuk.jdbc.model.Contact;

public class ContactDao {
	
	private Connection connection;
	
	public ContactDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Contact contact) {
		
		String sql = "insert into contacts (name, email, address, dateOfBirth) " +
						"values (?, ?, ?, ?)";
		
		try {

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1,contact.getName());
			statement.setString(2,contact.getEmail());
			statement.setString(3,contact.getAddress());
			
			statement.setDate(4, new Date(
					contact.getDateOfBirth().getTimeInMillis()
				)
			);

			statement.execute();
			statement.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
