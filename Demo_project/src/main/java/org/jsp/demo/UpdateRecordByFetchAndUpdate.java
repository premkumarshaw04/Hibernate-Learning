package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecordByFetchAndUpdate {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		tran.begin();
		System.out.println("Enter the Primary key: ");
		Employee e = ses.load(Employee.class, new Scanner(System.in).nextInt());
		if(e != null) {
			e.setName("Bharath");
			tran.commit();
		}
		else {
			System.err.println("No Records found");
		}
	}
}
