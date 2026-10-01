package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPancardId {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p from Person p where p.card.id =?1");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter pancard id: ");
	int panid = sc.nextInt();
 	q.setParameter(1, panid);
 	try {
		Person p = (Person) q.getSingleResult();
		System.out.println(p);
	} catch (NoResultException e) {
		System.err.println("No record found");
	}
}
}