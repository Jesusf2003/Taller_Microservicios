package com.order.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "payment-service", url = "http://localhost:9002", fallback = PaymentHystrixFallbackFactory.class)
public interface PaymentClient {

	@GetMapping(value = "/payment/id/{id}")
	Payment findPaymentById(@PathVariable("id") String id);
}