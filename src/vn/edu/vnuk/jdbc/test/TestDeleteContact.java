package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestDeleteContact {
	
    public static void main(String args[]) throws SQLException{

        Contact contact = new ContactDao().read(5);

        ContactDao contactDao = new ContactDao();
        contactDao.delete(contact);

    }

}
