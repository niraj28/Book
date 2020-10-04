package com.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ordercontroller.Order;



public interface BookRepository extends CrudRepository<Book, String> {
	public Book findByBookname(String bookname);
	public List<Book> findByAuthorname(String authorname);
	public List<Book> findByGenre(String genre);
	public void save(List<Order> order);
	 

}
