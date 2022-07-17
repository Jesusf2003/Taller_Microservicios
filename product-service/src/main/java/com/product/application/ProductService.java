package com.product.application;

import java.util.List;

import com.product.domain.Product;
import com.product.domain.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return this.repository.findAll();
	}
	
	public Product findProductById(String id) {
		return this.repository.findProductById(id);
	}
	
	public Product create(Product product) {
		return this.repository.create(product);
	}
	
	public ResponseEntity<?> update(Product product) {
		this.repository.update(product);
		return new ResponseEntity<String>("Producto actualizado", HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> delete(String id) {
		this.repository.delete(id);
		return new ResponseEntity<String>("Producto eliminado", HttpStatus.OK);
	}
}