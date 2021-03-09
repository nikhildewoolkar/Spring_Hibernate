package in.cdac;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateRegister {

	public static void registerUser(Lawyer lawyer) throws Exception{
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(lawyer);
		txn.commit();
		session.close();	
	}
	
}
