package org.jsp.manytooneuni;

import java.util.Arrays;
import java.util.List;

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
		QuestionData qd = new QuestionData();
		qd.setQuestion("What is the most important thing in your life.");
		qd.setQuestionedBy("Mayank");
		
		AnswerData a1 = new AnswerData();
		a1.setAnswer("Money");
		a1.setAnsweredBy("Aditya");
		a1.setQd(qd);
		
		AnswerData a2 = new AnswerData();
		a2.setAnswer("Behaviour");
		a2.setAnsweredBy("Mayank");
		a2.setQd(qd);
		
		AnswerData a3 = new AnswerData();
		a3.setAnswer("Health&Money");
		a3.setAnsweredBy("Aishwarya");
		a3.setQd(qd);
		
		AnswerData a4 = new AnswerData();
		a4.setAnswer("Peace");
		a4.setAnsweredBy("Sakshi");
		a4.setQd(qd);
		
		AnswerData a5 = new AnswerData();
		a5.setAnswer("Power");
		a5.setAnsweredBy("Pratyush");
		a5.setQd(qd);
		
		AnswerData a6 = new AnswerData();
		a6.setAnswer("Job");
		a6.setAnsweredBy("Neha");
		a6.setQd(qd);
		
		AnswerData a7 = new AnswerData();
		a7.setAnswer("Friends");
		a7.setAnsweredBy("Rona");
		a7.setQd(qd);
		
		AnswerData a8 = new AnswerData();
		a8.setAnswer("Personal Growth");
		a8.setAnsweredBy("Varna");
		a8.setQd(qd);
		
		List<AnswerData> al = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		for(AnswerData ad : al) {
			em.persist(ad);
		}
		
		etran.commit();
	}
}
