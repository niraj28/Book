
package com.quantitycontroller;


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
public class QuantityController {
    @Autowired
    QuantityService quantityservice;
      
    @RequestMapping(method=RequestMethod.POST, value="/quantity/save")
    public void add(@RequestBody Quantity quantity){
    	quantityservice.addQuantity(quantity);
        
    }
    
    
  
    
   
      
    @RequestMapping("/quantity/findall")
    public List<Quantity> findAll(){
    	return quantityservice.findAll();
       
    }
      
    @RequestMapping("/quantity/findby/{bookid}")
    public Quantity findById(@PathVariable String bookid){
    	return quantityservice.findById(bookid);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/quantity/updateby/{bookid}")
	public void updateTopic(@RequestBody Quantity quantity,@PathVariable String bookid) {
    	quantityservice.updateTopic(bookid, quantity);	
	}
    
  
      
    @RequestMapping("/quantity/deleteby/{bookid}")
    public void deleteByQuantityId(@PathVariable String quantityid){
        
          
    	quantityservice.deleteByQuantityId(quantityid);   
      
    }
   
}