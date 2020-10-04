package com.orderplaced;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderplaced")
public class OrderPlaced {
	
	@Id
	@Column(name="orderid")
	String orderid;
	


	@Column(name="userid")
	String userid;
	@Column(name="date")
     String date;
	
	
	
	protected OrderPlaced() {
		
	}
	
	
	public OrderPlaced(String orderid, String userid, String date) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.date = date;
	}
	
	
	

	public String getOrderid() {
		return orderid;
	}


	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
