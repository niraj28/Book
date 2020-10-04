package com.orderrelation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderRelationService {
	
	@Autowired
	OrderRelationRepository orderrelationrepository;

	public void addOrderRelationPlaced(List<OrderRelation> orderrelation) {
		orderrelationrepository.saveAll(orderrelation);
		
	}

	public void addInOrderRelation(List<OrderRelation> orderrelation) {
		
		orderrelationrepository.saveAll(orderrelation);
	}

	public  List <OrderRelation>  findall(String orderid) {
		List<OrderRelation> orderrelation=	new ArrayList<>();
		
		orderrelationrepository.findByOrderid(orderid)
           .forEach(orderrelation::add);
           return orderrelation;
	}

}
