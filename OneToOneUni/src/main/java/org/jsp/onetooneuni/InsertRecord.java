package org.jsp.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etran = em.getTransaction();
		
		etran.begin();
		Person p = new Person();
		p.setName("Rahul");
		p.setPhone(5689745823L);
		
		Pancard card = new Pancard();
		card.setPanNo("BOKJH785D");
		card.setDob("25-12-2001");
		
		p.setCard(card);
		
		em.persist(card);
		em.persist(p);
		
		etran.commit();
	}
}
	
