package onetomanyormanytoonebi;

import java.util.Arrays;

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
		m.setName("Zudio");
		m.setGst_num("ZUIDIO12345");
		m.setEmail("zudio123@gmail.com");
		m.setPhone(4785697845L);
		m.setPassword("zudio@123");
		
		Product p1 = new Product();
		p1.setName("Shirt");
		p1.setBrand("Zudio");
		p1.setCategory("Formal");
		p1.setPrice(999.0);
		p1.setM(m);
		
		Product p2 = new Product();
		p2.setName("T-Shirt");
		p2.setBrand("Zudio");
		p2.setCategory("Polo");
		p2.setPrice(1299.0);
		p2.setM(m);
		
		Product p3 = new Product();
		p3.setName("Jeans");
		p3.setBrand("Zudio");
		p3.setCategory("Casual");
		p3.setPrice(1099.0);
		p3.setM(m);
		
		m.setProds(Arrays.asList(p1,p2,p3));
		em.persist(m);
		etran.commit();
		
	}
}
