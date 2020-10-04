package com.orderplaced;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins="*",maxAge=3600)

@RestController
public class OrderPlacedController{
    @Autowired
    OrderPlacedService orderplacedservice;
      
    @RequestMapping(method=RequestMethod.POST, value="/orderplaced/save")
    public void add(@RequestBody OrderPlaced orderplaced){
        orderplacedservice.addOrderPlaced(orderplaced);
        
    }
      
      
    @RequestMapping("/orderplaced/findall")
    public List<OrderPlaced> findAll(){
        return orderplacedservice.findAll();
    }
      
    @RequestMapping("/orderplaced/findby/{orderid}")
    public OrderPlaced findById(@PathVariable String userid){
       
        return orderplacedservice.findById(userid);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/orderplaced/updateby/{orderid}")
	public void udateOrderPlaced(@RequestBody OrderPlaced orderplaced,@PathVariable String orderid) {
	orderplacedservice.updateOrderPlaced(orderid, orderplaced);	
	}
      
    @RequestMapping("/orderplaced/deleteby/{orderid}")
    public void deleteByOrderId(@PathVariable String orderid){
        
          
         orderplacedservice.deleteById(orderid);
             
      
    }
   
}
