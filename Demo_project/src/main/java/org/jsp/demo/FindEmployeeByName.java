package org.jsp.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByName {
public static void main(String[] args) {
	Configuration conf = new Configuration();
	conf.configure();
	SessionFactory sef = conf.buildSessionFactory();
	Session ses = sef.openSession();
	Query<Employee> q = ses.createQuery("select e from Employee e where e.name = ?1");
	
	System.out.println("Enter the name");
	q.setParameter(1, new Scanner(System.in).nextLine());
	
	List<Employee> el = q.getResultList();
	if(el.size()>0) {
		for(Employee emp: el) {
			System.out.println(emp);
		}
	}else {
		System.err.println("No records found");
	}
}
}