package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonPhone {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	Query q = em.createQuery("select p.card from Person p where p.phone= ?1");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter PhoneNo: ");
	long phone = sc.nextLong();
	q.setParameter(1, phone);
	try {
		Pancard pc = (Pancard) q.getSingleResult();
		System.out.println(pc);
	} catch (NoResultException e) {
		System.err.println("No result found");
	}
}
}