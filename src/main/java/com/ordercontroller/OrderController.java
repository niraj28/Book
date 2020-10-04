package com.ordercontroller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usercontroller.User;



@CrossOrigin(origins="*",maxAge=56000)
@RestController
public class OrderController {
    @Autowired
    OrderService orderservice;
     
    
  
    
    
    
    
      
    @RequestMapping(method=RequestMethod.POST, value="/users/{userid}/order")
    public void add(@RequestBody Order order, @PathVariable String userid){
    	order.setUser(new User(userid,"","","","","","",""));
        orderservice.addOrder(order);
        
    }
      
    @RequestMapping("/users/{userid}/orders")
    public List<Order> findAll(@PathVariable String userid){
        return orderservice.findAll(userid);
    } 
    
 
      
    @RequestMapping("/users/{orderid}")
    public Order findById(@PathVariable String orderid){
       
        return orderservice.findById(orderid);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/users/{userid}/orders/{orderid}")
	public void udateOrder(@RequestBody Order order,@PathVariable String userid, @PathVariable String orderid) {
    	order.setUser(new User(userid,"","","","","","",""));
	orderservice.updateOrder(order);	
	}
      
    @RequestMapping("/users/{userid}/orders/{orderid}")
    public void deleteByBookId(@PathVariable String orderid){
        
          
         orderservice.deleteById(orderid);
             
      
    }
   
}