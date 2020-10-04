package com.ordercontroller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



public interface OrderRepository extends CrudRepository<Order, String>  {
	public List<Order> findByUserUserid(String userid);

	public void save(String orderid);

	public void save(List<Order> order);
}
