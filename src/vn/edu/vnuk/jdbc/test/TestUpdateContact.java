package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {
	
    public static void main(String args[]) throws SQLException{

        Contact contact = new ContactDao().read(4);

        contact.setName("C.C. Cash");
        contact.setEmail("cccash@success.com");
        contact.setAddress("In the backseat of my Cadillac");
        contact.setDateOfBirth(Calendar.getInstance());

        ContactDao contactDao = new ContactDao();
        contactDao.update(contact);

    }

}
