package com.quantitycontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuantityService {
	
	
	 @Autowired
	    QuantityRepository repository;

	public void addQuantity(Quantity quantity) {
		repository.save(quantity);
		
	}

	public List<Quantity> findAll() {
		List<Quantity> quantities=	new ArrayList<>();
		
        repository.findAll()
        .forEach(quantities::add);
        return quantities;
		
		
	}

	public Quantity findById(String bookid) {
		
		return repository.findById(bookid).orElse(null);
		
	}

	public void updateTopic(String bookid, Quantity quantity) {
		repository.save(quantity);
		
	}

	public void deleteByQuantityId(String bookid) {
		repository.deleteById(bookid);
		
	}
	 
	 
	 

}
