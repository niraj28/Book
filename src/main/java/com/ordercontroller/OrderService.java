package com.ordercontroller;





import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class OrderService {
	
	 @Autowired
	    OrderRepository repository;
	
	

		public void addOrder(Order order) {
			repository.save(order);
			
		}
		
		
		
		
		
	    public List<Order> findAll(String userid){
	    		//return books;
	    	List<Order> orders=	new ArrayList<>();
	    		
	    	repository.findByUserUserid(userid)
	           .forEach(orders::add);
	           return orders;
	 
	    }
	    
	    
	    public Order findById(String orderid){	    	
	    		return repository.findById(orderid).orElse(null);
	    		
	    }

	
	    public void updateOrder(Order order) {
	    	repository.save(order);	
	    	}
	    
	    
	    public void deleteById( String orderid){
	        
	          
	         repository.deleteById(orderid);
	             
	      
	    }
	
	


	


}
