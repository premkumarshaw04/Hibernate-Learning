package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordByUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		
//		tran.begin();
//		Employee e = new Employee();
//		e.setId(2);
//		e.setName("Ankit");
//		ses.update(e);
//		tran.commit();
		
		tran.begin();
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Anshu");
		e1.setSalary(78900);
		ses.update(e1);//OptimisticLockException
		tran.commit();
		
	}
}
