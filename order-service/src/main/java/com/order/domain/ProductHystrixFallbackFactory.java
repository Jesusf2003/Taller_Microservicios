package com.order.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {
	
	@Override
	public Product findProductById(String id) {
		Product product = new Product();
		return product.builder()
				.id(id)
				.name(product.getName())
				.stock(product.getStock())
				.price(product.getPrice())
				.build();
	}
}