package com.orderrelation;

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
public class OrderRelationController {
	
	 @Autowired
	    OrderRelationService orderrelationservice;
	      
	    @RequestMapping(method=RequestMethod.POST, value="/orderrelation/save")
	    public void add(@RequestBody List<OrderRelation> orderrelation){
	        orderrelationservice.addOrderRelationPlaced(orderrelation);
	        
	    }
	    
	    @RequestMapping("/orderrelation/findall/{orderid}")
	    public List<OrderRelation> findall(@PathVariable String orderid){
	        return orderrelationservice.findall(orderid);
	        
	    }

	
}
