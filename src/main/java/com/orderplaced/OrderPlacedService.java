package com.orderplaced;











import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.orderrelation.OrderRelation;




@Service
public class OrderPlacedService {
	
	 @Autowired
	    OrderPlacedRepository repository;
	
	

		public void addOrderPlaced(OrderPlaced orderplaced) {
			repository.save( orderplaced);
			
		}
		
		
		
		
		
	    public List<OrderPlaced> findAll(){
	    		//return books;
	    	List<OrderPlaced> orders=	new ArrayList<>();
	    		
	           repository.findAll()
	           .forEach(orders::add);
	           return orders;
	 
	    }
	    
	    
	    public OrderPlaced findById(@PathVariable String orderid){	    	
	    		return repository.findById(orderid).orElse(null);
	    		
	    }

	
	    public void updateOrderPlaced(String orderid, OrderPlaced orderplaced) {
	    	repository.save(orderplaced);	
	    	}
	    
	    
	    public void deleteById( String orderid){
	        
	          
	         repository.deleteById(orderid);
	             
	      
	    }





	
	


	


}
