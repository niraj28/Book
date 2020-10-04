package com.controller;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ordercontroller.Order;

@Entity
@Table(name = "booksavailable")
public class Book {
	@Id
	String bookid;


	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Column(name="bookname")
	String bookname;
	@Column(name="authorname")
	String authorname;
	@Column(name="genre")
	String genre;
	
	@Column(name="price")
	int price;
	
	@ManyToMany(targetEntity=Order.class,mappedBy="books", cascade = CascadeType.ALL, fetch=FetchType.EAGER)

	private List<Order> orders;	
	
	
	
	public Book() {
	
	}
	
	public Book(String bookid, String bookname, String authorname, String genre, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.genre = genre;
		
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return String.format("Book[bookid=%s, bookname='%s', authorname='%s', genre='%s', price='%s']", bookid, bookname, authorname, genre, price);
	}
	
	
	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
