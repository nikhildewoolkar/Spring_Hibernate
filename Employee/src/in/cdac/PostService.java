package in.cdac;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PostService {
	public static List<Employee> readPostHBM() {
		SessionFactory sessionFactory = HibernateUtil.sessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Employee> result = session.createQuery("FROM Employee").list();
	    txn.commit();
	    session.close();
	    return result;
	}
}
