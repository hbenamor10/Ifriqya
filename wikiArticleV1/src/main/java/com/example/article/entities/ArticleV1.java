
package com.example.article.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@Entity
public abstract class ArticleV1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String title ;

    private String author;
    private String publishDate = new Date().toString() ;
    private String status;
    private String lastModifiedDate = new Date().toString();

    private String category;
    private String body ;
    
	public ArticleV1(String title, String author2, String publishDate, String status, String lastModifiedDate,
			String category2, String body) {
		super();
		this.title = title;
		this.author = author2;
		this.publishDate = publishDate;
		this.status = status;
		this.lastModifiedDate = lastModifiedDate;
		this.category = category2;
		this.body = body;
	}

	public ArticleV1() {

		super();
	}

	public ArticleV1(String title, String status, String body) {
		super();
		this.title = title;
		this.status = status;
		this.body = body;
	}

	public ArticleV1(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = new Date().toString();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	
    
    
    
    
}

