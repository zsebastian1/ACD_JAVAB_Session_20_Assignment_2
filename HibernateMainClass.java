package hibernatePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMainClass {

	private static SessionFactory factory;
	
	public static void main(String[] args) {

		factory = new Configuration().configure().buildSessionFactory();
		Message message = new Message();
		message.setMessage("Hello World!");
		Session session = factory.openSession();
		
		Transaction tnx = session.beginTransaction();
		session.save(message);
		tnx.commit();
		session.close();
	}

}
