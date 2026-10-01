package org.jsp.onetooneuni;

import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindPersonByName {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Person p where p.name = ?1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.next();
		q.setParameter(1, name);
		List<Person> l = q.getResultList();
		if(!l.isEmpty()) {
			Iterator<Person> i = l.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		else {
			System.err.println("No records found:");
		}
		
	}
}
