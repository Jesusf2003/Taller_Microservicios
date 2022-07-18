package com.order.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "product", url = "http://localhost:9001", fallback = ProductHystrixFallbackFactory.class)
public interface ProductClient {

	@GetMapping(value = "/product/id/{id}")
	Product findProductById(@PathVariable("id") String id);
}