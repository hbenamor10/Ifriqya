package com.example.article.entities;

import jakarta.persistence.Entity;

@Entity
public class SimpleUser extends User{
    private String role = "SimpleUser";

	public SimpleUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleUser(String name, String lastName, String birthdate, String email, String password) {
		super(name, lastName, birthdate, email, password);
		// TODO Auto-generated constructor stub
	}

	public SimpleUser(String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
    

    
}
