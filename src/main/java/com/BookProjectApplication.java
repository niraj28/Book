package com;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.controller.BookRepository;
import com.ordercontroller.Order;
import com.ordercontroller.OrderRepository;

@SpringBootApplication(scanBasePackages={"com","com.controller","com.ordercontroller","com.quantitycontroller","com.usercontroller","com.orderplaced"})
@CrossOrigin(origins="*",maxAge=56000)
@RestController
public class BookProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookProjectApplication.class, args);
	}
	
	@Autowired
	OrderRepository orderrepository ;
	
	@Autowired
	BookRepository bookrepository;
	
	
	
	 @RequestMapping(method=RequestMethod.POST, value="/manyorder/order/{orderid}")
	    public void add(@RequestBody  List<Order> order, @PathVariable String orderid){
		 
		for(int i=0;i<order.size();i++) {
	    //               orderrepository.save((new Order(orderid,"","",0,0))); 
	 //                 Optional<Book> book=bookrepository.findById(order.get(i).getBookid());
	    //              order.get(i).addBook(book);
	 	   ///    bookrepository.save((new Book(bkid,"","","",0)));	
	 	       //bookrepository.
	    	 }	    
	       
	    }
}
	      
	

