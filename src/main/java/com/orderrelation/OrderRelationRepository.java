package com.orderrelation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface OrderRelationRepository extends CrudRepository<OrderRelation, String> {
	public List<OrderRelation> findByOrderid(String orderid);

}
