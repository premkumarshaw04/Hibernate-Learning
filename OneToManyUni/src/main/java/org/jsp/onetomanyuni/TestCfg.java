package org.jsp.onetomanyuni;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCfg {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("M15");
		System.out.println(emf);
	}
}
