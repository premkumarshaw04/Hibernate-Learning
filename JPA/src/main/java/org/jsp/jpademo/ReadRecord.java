package org.jsp.jpademo;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadRecord {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	System.out.println("Enter the primary key: ");
	Merchant m = em.find(Merchant.class, new Scanner(System.in).nextInt());
	if(m!=null) {
		System.out.println(m);
	}else {
		System.err.println("No recods found since primary key is invalid");
	}
}
}
