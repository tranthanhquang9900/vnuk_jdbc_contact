package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.List;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestReadContacts {
	
	public static void main(String args[]) throws SQLException{
		
		
		ContactDao contactDao = new ContactDao();
		List<Contact> contacts = contactDao.read();
		
		for (Contact contact : contacts) {
			System.out.println("Id: " + contact.getId());
			System.out.println("Name: " + contact.getName());
			System.out.println("Email: " + contact.getEmail());
			System.out.println("Address: " + contact.getAddress());
			System.out.println("Date of birth: " +
					contact.getDateOfRegister().getTime() + "\n");
		}
		
	}

}
