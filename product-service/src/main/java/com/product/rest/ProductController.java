package com.product.rest;

import java.util.List;

import com.product.application.ProductService;
import com.product.domain.Product;
import com.product.domain.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductRepository repository;
	@Autowired
	private ProductService service = new ProductService(repository);
	
	@GetMapping
	private List<Product> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("/id/{id}")
	private Product findProductById(@PathVariable String id) {
		return this.service.findProductById(id);
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return this.service.create(product);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Product product) {
		return this.service.update(product);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return this.service.delete(id);
	}
}