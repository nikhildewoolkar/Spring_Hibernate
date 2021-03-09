package in.cdac;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PostService {
	public static List<Lawyer> readPostHBM() {
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Lawyer> result = session.createQuery("FROM Lawyer").list();
	    txn.commit();
	    session.close();
	    return result;
	}
}
