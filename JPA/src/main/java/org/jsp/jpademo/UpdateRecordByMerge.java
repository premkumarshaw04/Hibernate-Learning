package org.jsp.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecordByMerge {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
	EntityManager em = emf.createEntityManager();
	EntityTransaction etran = em.getTransaction();
	etran.begin();
	Merchant m = new Merchant();
//	If id is not present!
	m.setId(10);
	m.setName("Gucci");
	m.setEmail("gucci@gmail.com");
	m.setGst_num("GUCCI14578");
	m.setPhone(2854123601l);
	m.setPassword("gucii123");
	em.merge(m);
	etran.commit();
	
//	In the above id was not there so it created new Record Since we are using JPA Annotation 
//	so prioruity will be given to annotation
//	That's why we eneter id as 10 but in db it stores as 2.
	
//	If the id is present and we try to update one field other field will get the default value.
	
//	If we want to provide our own primary key the we need to remove Generated value from entity calss.
}
}
