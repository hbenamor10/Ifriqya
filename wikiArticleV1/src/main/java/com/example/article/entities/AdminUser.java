
package com.example.article.entities;

import jakarta.persistence.Entity;

@Entity
public class AdminUser extends User{
    private String role = "Admin";

	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminUser(String name, String lastName, String birthdate, String email, String password) {
		super(name, lastName, birthdate, email, password);
		// TODO Auto-generated constructor stub
	}

	public AdminUser(String role) {
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

