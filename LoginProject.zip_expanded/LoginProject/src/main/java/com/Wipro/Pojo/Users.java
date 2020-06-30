package com.Wipro.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Users {

	@Id
	private String username;

	private String firstname;

	private String lastname;

	private String password;

	private String Type;

	@ManyToOne
	private Authorities a;

	private int enabled;

	public Users(String username, String firstname, String lastname, String password, String type, int enabled) {

		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.Type = type;
		this.enabled = enabled;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Users() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Authorities getA() {
		return a;
	}

	public void setA(Authorities a) {
		this.a = a;
	}

}
