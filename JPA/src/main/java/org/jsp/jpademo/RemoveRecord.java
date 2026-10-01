package org.jsp.jpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveRecord {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	EntityTransaction etran = em.getTransaction();
	System.out.println("Enter the primary key: ");
	etran.begin();
	Merchant m = em.find(Merchant.class, new Scanner(System.in).nextInt());
	if(m!=null) {
		em.remove(m);
		etran.commit();
	}else {
		System.err.println("No record deleted since primary key is invalid");
	}
}
}
