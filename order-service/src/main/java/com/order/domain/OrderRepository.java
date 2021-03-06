package com.order.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
	
	Product findProductById(String id);
	Payment findPaymentById(String id);
}