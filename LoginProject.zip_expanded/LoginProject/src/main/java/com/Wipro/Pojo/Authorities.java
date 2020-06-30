package com.Wipro.Pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class Authorities {

	@Id
	@Column
	private String username;
	
	@Column
	private String authority;
	
	
	@OneToMany(mappedBy="a",cascade=CascadeType.ALL)
	private List<Users> user=new ArrayList<Users>();


	public Authorities() {
		
	}
	
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}


	public List<Users> getUser() {
		return user;
	}


	public void setUser(List<Users> user) {
		this.user = user;
	}



	public Authorities(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	} 
	
}
