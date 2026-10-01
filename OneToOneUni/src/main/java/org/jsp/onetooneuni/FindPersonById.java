//1. Find Person By id.
package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FindPersonById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		Person p = em.find(Person.class, id);
		System.out.println(p);
	}
}
