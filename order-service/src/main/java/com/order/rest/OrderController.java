package com.order.rest;

import java.util.List;
import java.util.Optional;

import com.order.application.OrderService;
import com.order.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

	private final OrderService service;
	private ProductClient clientProduct;
	private PaymentClient clientPayment;
	
	@GetMapping
	public List<Order> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Optional<Order> findOrderById(@PathVariable String id) {
		return this.service.findOrderById(id);
	}
	
	@PostMapping("/save")
	public Order save(@RequestBody Order order) {
		
		Product product = clientProduct.findProductById(order.getProduct().getId());
		Payment payment = clientPayment.findPaymentById(order.getPayment().getId());
		
		System.out.println(product.toString());
		System.out.println(payment.toString());
		
		order.setProduct(product);
		order.setPayment(payment);
		
		return service.create(order);
	}
	
	@GetMapping("/product/id/{id}")
	private Product traerProduct(@PathVariable("id") String id) {
		return clientProduct.findProductById(id);
	}
	
	@GetMapping("/payment/id/{id}")
	private Payment traerPayment(@PathVariable("id") String id) {
		return clientPayment.findPaymentById(id);
	}
	
	@PutMapping
	public void update(@RequestBody Order order) {
		this.service.update(order);
	}
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable String id) {
		this.service.delete(id);
	}
}