package org.jsp.jpademo;


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
	Merchant m = new Merchant();
	m.setName("Zara");
	m.setGst_num("Zara896554");
	m.setEmail("zara@gmail.com");
	m.setPhone(1814556985);
	m.setPassword("Zara#@123");
	
	em.persist(m);
	etran.commit();
}
}
