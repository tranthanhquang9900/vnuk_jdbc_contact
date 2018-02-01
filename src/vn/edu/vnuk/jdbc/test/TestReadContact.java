package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestReadContact {
	
    public static void main(String args[]) throws SQLException{

        ContactDao contactDao = new ContactDao();
        Contact contact = contactDao.read(1);

        System.out.println("Id: " + contact.getId());
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Address: " + contact.getAddress());
        
        System.out.println("Date of birth: " 
            + (contact.getDateOfBirth() != null ? contact.getDateOfBirth().getTime() : null)
            + "\n");

    }

}
