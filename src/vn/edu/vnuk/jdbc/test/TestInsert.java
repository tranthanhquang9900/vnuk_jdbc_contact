package vn.edu.vnuk.jdbc.test;

import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestInsert {
	
	public static void main(String[] args) {
		
		Contact contact = new Contact();
		contact.setName("Modern Coding");
		contact.setEmail("modern.coding@success.com");
		contact.setAddress("Let's talk about code");
		contact.setDateOfBirth(Calendar.getInstance());
		
		ContactDao dao = new ContactDao();
		dao.add(contact);
		
		System.out.println("Contact registered!");
		
	}

}
