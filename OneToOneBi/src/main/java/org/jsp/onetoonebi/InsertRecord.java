package org.jsp.onetoonebi;

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
		User u = new User();
		u.setName("A");
		u.setPassword("A@123%$");
		u.setPhone(9658741235L);
		
		AadharCard card = new AadharCard();
		card.setNumber(987456892514L);
		card.setDOB("10-11-1998");
		card.setAddress("Gazipur");
		card.setUser(u);	
		
		u.setCard(card);
		em.persist(u);
		etran.commit();
	}
}
