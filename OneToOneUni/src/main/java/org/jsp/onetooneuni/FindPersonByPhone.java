package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindPersonByPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Person p where p.phone = ?1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone no: ");
		long phone = sc.nextLong();
		q.setParameter(1, phone);
		try {
			Person p = (Person)q.getSingleResult();
			System.out.println(p);
		}
		catch(NoResultException e) {
			System.err.println("No records found");
		}
		
	}
}
