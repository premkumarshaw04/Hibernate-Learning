package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();//Upcasting
		Transaction tran = ses.getTransaction();
		
		tran.begin();//Transection begins here
		Employee e1 = new Employee();
//		e.setId(0); //We dont need to add this, it will be generated automatically by generator
		e1.setName("A");
		e1.setSalary(45000);
		ses.save(e1);
		
		Employee e2 = new Employee();
		e2.setName("B");
		e2.setSalary(75000);
		ses.save(e2);
		
		Employee e3 = new Employee();
		e3.setName("C");
		e3.setSalary(85000);
		ses.save(e3);
		
		Employee e4 = new Employee();
		e4.setName("C");
		e4.setSalary(85000);
		ses.save(e4);
		tran.commit();//Transection ends here
	}
}
