package com.orderrelation;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="orderrelation")

public class OrderRelation {
	
	
	@Id
	@GeneratedValue
	int Id;


	@Column(name="orderid")
	String orderid;
	
	@Column(name="bookid")
	String bookid;
	
	@Column(name="quantity")
	 String quantity;


	
	public OrderRelation() {
		
	}
	
	public OrderRelation(int id, String orderid, String bookid, String quantity) {
		super();
		Id = id;
		this.orderid = orderid;
		this.bookid = bookid;
		this.quantity = quantity;
	}
	

	
	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	

}
