package com.order.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "payment", url = "http://localhost:9002", fallback = PaymentHystrixFallbackFactory.class)
public interface PaymentClient {

	@GetMapping(value = "/payment/id/{id}")
	Payment findPaymentById(@PathVariable("id") String id);
}