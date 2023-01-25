
package com.example.article.entities;

import jakarta.persistence.Entity;

@Entity
public class ValidatedArticle extends ArticleV1 {
    private String status = "validated";



	public ValidatedArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidatedArticle(String title, String author2, String publishDate, String status, String lastModifiedDate,
			String category2, String body) {
		super(title, author2, publishDate, status, lastModifiedDate, category2, body);
		// TODO Auto-generated constructor stub
	}

	public ValidatedArticle(String title, String body) {
		super(title, body);
		// TODO Auto-generated constructor stub
	}

	public ValidatedArticle(String title, String author2, String publishDate, String status, String lastModifiedDate,
			String category2, String body, String status2) {
		super(title, author2, publishDate, status, lastModifiedDate, category2, body);
		status = status2;
	}

	public ValidatedArticle(String title, String status, String body) {
		super(title, status, body);
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}



