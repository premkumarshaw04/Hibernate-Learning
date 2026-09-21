package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordBySaveOrUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		
//		tran.begin();
//		Employee e = new Employee();
//		e.setId(4);
//		e.setName("Prem");
//		e.setSalary(45000);
//		ses.saveOrUpdate(e);
//		tran.commit();
		
		//If the id is not present in the database
		tran.begin();
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Dinesh");
		e1.setSalary(78000);
		ses.saveOrUpdate(e1); //in this case this id will be created and the record will be added
		tran.commit();
		
	}
}
