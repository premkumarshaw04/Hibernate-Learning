package org.jsp.jpademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

//2nd way to create query | JPQL Query
@NamedQuery(name="findAll", query="select m from Merchant m")

@NamedQuery(name="findMerchantByEmailAndPassword", query="select m from Merchant m where m.email = ?1 and m.password= ?2")

@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gst_num;
	private String email;
	private long phone;
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
	public String getGst_num() {
		return gst_num;
	}
	public void setGst_num(String gst_num) {
		this.gst_num = gst_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	@Override
	public String toString() {
		return id+ " " + name +" "+ gst_num+" "+email+" "+phone+" "+password;
	}
	
	
}
