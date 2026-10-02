//Child class
package org.jsp.manytooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Question;
	private String questionedBy;
	//getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getQuestionedBy() {
		return questionedBy;
	}
	public void setQuestionedBy(String questionedBy) {
		this.questionedBy = questionedBy;
	}
	
	
}
