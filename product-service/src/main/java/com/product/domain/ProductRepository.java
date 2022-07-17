package com.product.domain;

import java.util.List;

public interface ProductRepository {

	List<Product> findAll();
	
	Product findProductById(String id);
	
	Product create(Product product);
	
	void update(Product product);
	
	void delete(String id);
}