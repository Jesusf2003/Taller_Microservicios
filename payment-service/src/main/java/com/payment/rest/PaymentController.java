package com.payment.rest;

import java.util.List;

import com.payment.application.PaymentService;
import com.payment.domain.Payment;
import com.payment.domain.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private PaymentRepository repository;
	@Autowired
	private PaymentService service = new PaymentService(repository);
	
	@GetMapping
	public List<Payment> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Payment findPaymentById(@PathVariable String id) {
		return this.service.findPaymentById(id);
	}
	
	@PostMapping
	public Payment save(@RequestBody Payment payment) {
		return this.service.create(payment);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Payment payment) {
		return this.service.update(payment);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return this.service.delete(id);
	}
}