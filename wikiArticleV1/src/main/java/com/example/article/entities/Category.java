
package com.example.article.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_category;
    @OneToMany
    private Collection<ArticleV1> articles;
    
	public Category(Long id, String nom_category, Collection<ArticleV1> articles) {
		super();
		this.id = id;
		this.nom_category = nom_category;
		this.articles = articles;
	}

	public Category(String nom_category) {
		super();
		this.nom_category = nom_category;
	}



	public Category() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_category() {
		return nom_category;
	}

	public void setNom_category(String nom_category) {
		this.nom_category = nom_category;
	}

	public Collection<ArticleV1> getArticles() {
		return articles;
	}

	public void setArticles(Collection<ArticleV1> articles) {
		this.articles = articles;
	}
    
	
    
    

}

