package com.payment.domain;

import java.util.List;

public interface PaymentRepository {

	List<Payment> findAll();
	
	Payment findPaymentById(String id);
	
	Payment create(Payment payment);
	
	void update(Payment payment);
	
	void delete(String id);
}