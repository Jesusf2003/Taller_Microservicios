package com.payment.infraestructure;

import java.util.List;

import com.payment.domain.Payment;
import com.payment.domain.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentRepository {

	@Autowired
	private final MongoOperations operations;

	@Override
	public List<Payment> findAll() {
		return this.operations.findAll(Payment.class);
	}

	@Override
	public Payment findPaymentById(String id) {
		return this.operations.findOne(new Query(Criteria.where("id").is(id)), Payment.class);
	}

	@Override
	public Payment create(Payment payment) {
		System.out.println(payment.toString());
		return this.operations.save(payment);
	}

	@Override
	public void update(Payment payment) {
		this.operations.save(payment);
	}

	@Override
	public void delete(String id) {
		this.operations.findAndRemove(new Query(Criteria.where("id").is(id)), Payment.class);
	}
}