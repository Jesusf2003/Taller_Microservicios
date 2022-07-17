package com.product.infraestructure;
import java.util.List;

import com.product.domain.Product;
import com.product.domain.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ProductServiceImpl implements ProductRepository {

	@Autowired
	private final MongoOperations operations;
	
	@Override
	public List<Product> findAll() {
		return this.operations.findAll(Product.class);
	}

	@Override
	public Product findProductById(String id) {
		return this.operations.findOne(
				new Query(
					Criteria.where("id").is(id)),
					Product.class
				);
	}

	@Override
	public Product create(Product product) {
		System.out.println(product.toString());
		return this.operations.save(product);
	}

	@Override
	public void update(Product product) {
		this.operations.save(product);
	}

	@Override
	public void delete(String id) {
		this.operations.findAndRemove(
				new Query(
					Criteria.where("id").is(id)),
					Product.class
				);
	}
}