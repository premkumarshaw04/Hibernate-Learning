package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPancardNumberAndDOB {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p from Person p where p.card.panNo = ?1 and p.card.dob =?2");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter panNo: ");
	String panNo = sc.next();
	q.setParameter(1, panNo);
	System.out.print("Enter dob: ");
	String dob = sc.next();
	q.setParameter(2, dob);
	try {
		Person p = (Person) q.getSingleResult();
		System.out.println(p);
	} catch (NoResultException e) {
		System.err.println("No record found");
	}
}
}