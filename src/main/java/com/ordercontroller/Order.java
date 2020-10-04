package com.ordercontroller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.controller.Book;
import com.usercontroller.User;
@Entity
@Table(name="order1")
public class Order {
	
	@Id
	public String orderid;
	
	



	@Column(name="price")
    int price;
	public int getPrice() {
		return price;
	}

	



@ManyToOne
 private User user;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name = "order1_books" ,joinColumns = { @JoinColumn(name ="orderid")},
inverseJoinColumns = { @JoinColumn(name ="bookid")}
)
private List<Book> books;








///public void addBook(Optional<Book> book) {
//	books.addAll(book);
//}




	public Order() {
	
	}
	
	public Order(String orderid, String userid, int price) {
		super();
		this.orderid = orderid;
		
		this.price=price;
		
		this.user = new User(userid,"","","","","","","");
		
	}
	
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	
	  
		
		 public User getUser() {
				return user;
			}

			public void setUser(User user) {
				this.user = user;
			}

			
		
		
			
		

		
			
			


}
