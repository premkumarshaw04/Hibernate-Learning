package org.jsp.jpademo;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecordByFetchAndUpdate {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	EntityTransaction etran = em.getTransaction();
	etran.begin();
	System.out.print("Enter primary key: ");
	Merchant m = em.find(Merchant.class, new Scanner(System.in).nextInt());
	if(m!=null) {
		m.setPassword("Zudio#123");
		m.setGst_num("Zudio14785");
		etran.commit();
	}else {
		System.err.println("No records found due to invalid primary key");
	}
}
}
