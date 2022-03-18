package com.example.demo.emtity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	@Id
	@Column(name="isbn")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isbn;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private int price;
	
	@Column(name="quantity")
	private int quantity;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "isbn")
//	private Order_Detail order_Detail;

	public Book() {
		// TODO Auto-generated constructor stub
	}



	public Book(int isbn, String title, String author, String publisher, String description, int price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}



	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
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



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
