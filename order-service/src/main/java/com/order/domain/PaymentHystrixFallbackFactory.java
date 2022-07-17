package com.order.domain;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixFallbackFactory implements PaymentClient {

	@Override
	public Payment findPaymentById(String id) {
		Payment payment = new Payment();
		return payment.builder()
				.id(id)
				.cnumber(payment.getCnumber())
				.cname(payment.getCname())
				.vdate(payment.getVdate())
				.secode(payment.getSecode())
				.build();
	}
}