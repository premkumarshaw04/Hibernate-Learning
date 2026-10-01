package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPancardById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		Pancard p = em.find(Pancard.class, id);
		System.out.println(p);
	}
}