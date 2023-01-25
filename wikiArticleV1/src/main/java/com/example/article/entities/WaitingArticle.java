
package com.example.article.entities;

import jakarta.persistence.Entity;
import lombok.ToString;

@ToString
@Entity
public class WaitingArticle extends ArticleV1 {
    String status = "Wating";



	

	

	public WaitingArticle(String title, String author2, String publishDate, String status, String lastModifiedDate,
			String category2, String body) {
		super(title, author2, publishDate, status, lastModifiedDate, category2, body);
		// TODO Auto-generated constructor stub
	}

	public WaitingArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WaitingArticle(String title, String body) {
		super(title,body);
		// TODO Auto-generated constructor stub
	}



	public WaitingArticle(String title, String status, String body) {
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

