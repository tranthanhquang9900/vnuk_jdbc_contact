package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class JDBCInsert {

	public static void main(String[] args) throws SQLException {
		
		//		Connecting to DB
		Connection connection = new ConnectionFactory().getConnection();
		
		// 	Creating a preparedStatement
		String sqlQuery = "insert into contacts (name, email, address, dateOfBirth) "
				+	"values (?, ?, ?, ?)";
		
		PreparedStatement statement;
		
		try {
			
			statement = connection.prepareStatement(sqlQuery);
			
			//	Replacing "?" through values
			statement.setString(1, "Modern Coding");
			statement.setString(2, "modern.coding@success.com");
			statement.setString(3, "Let's talk about code");
			statement.setDate(4, new java.sql.Date(
					Calendar.getInstance().getTimeInMillis()
				)
			);
			
			// 	Executing statement
			statement.execute();
			statement.close();
			
			System.out.println("New record in DB !");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Done !");
			connection.close();
		}

	}

}
