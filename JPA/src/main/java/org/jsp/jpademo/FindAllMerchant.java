//Defining name for the JPQL Query
package org.jsp.jpademo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllMerchant {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("findAll");
		//createNamedQuery: this will take JPQL Queries
		List<Merchant> ml = q.getResultList();
		if(!ml.isEmpty()) {
			Iterator<Merchant> i = ml.iterator();
			while(i.hasNext()) {
				Merchant m = i.next();
				System.out.println(m);
			}
		}
		else {
			System.err.println("No record Found");
		}
	}
}
