package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestCreateContact {
	
	public static void main(String args[]) throws SQLException{
		
		Contact contact = new Contact();
		
		contact.setName("B.B. Batch");
		contact.setEmail("bbbatch@success.com");
		contact.setAddress("In the backtick of my Cadillac");
		contact.setDateOfRegister(Calendar.getInstance());
		
		
		ContactDao contactDao = new ContactDao();
		
		contactDao.create(contact);
		
	}

}
