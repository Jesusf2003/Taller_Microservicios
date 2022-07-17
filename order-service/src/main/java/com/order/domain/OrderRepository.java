package com.order.domain;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
	
	Optional<Product> findProductById(String id);
	Optional<Payment> findPaymentById(String id);
}