package org.jsp.jpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByGst_Num {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		EntityManager em = emf.createEntityManager();
		Query q = em.createNativeQuery("select * from merchant where gst_num=?1",Merchant.class); 
		//createNativeQuery: this will take SQL Queries
		System.out.println("Enter the gst_num: ");
		q.setParameter(1, new Scanner(System.in).next());
		try {
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println(m);
		}
		catch(NoResultException e) {
			System.err.println("No result found");
		}
	}
}
