package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByNumber {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select pc from Pancard pc where pc.panNo = ?1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the panNo: ");
		String panNo = sc.next();
		q.setParameter(1, panNo);
		try {
			Pancard p = (Pancard) q.getSingleResult();
			System.out.println(p);
		} catch (NoResultException e) {
			System.err.println("No records found!");
		}
	}
}