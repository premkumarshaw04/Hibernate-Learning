package org.jsp.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String password;
	private long phone;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private AadharCard card;
	public AadharCard getCard() {
		return card;
	}

	public void setCard(AadharCard card) {
		this.card = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
}
