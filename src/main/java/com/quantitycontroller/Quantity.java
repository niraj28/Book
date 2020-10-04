package com.quantitycontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quantity")
public class Quantity {
	@Id
	String bookid;
	

	@Column(name="quantities")
	int quantities;
	
	
	

	

	protected Quantity() {
	
	}
	
	
	public Quantity(String bookid, int quantities) {
		super();
		this.bookid = bookid;
		this.quantities = quantities;
	}

	
	

	public String getBookid() {
		return bookid;
	}


	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	
	public int getQuantities() {
		return quantities;
	}


	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}




}
