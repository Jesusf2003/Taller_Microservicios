package com.payment.rest;

import java.util.Date;
import java.util.List;

import com.payment.application.PaymentService;
import com.payment.domain.Payment;
import com.payment.domain.PaymentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private PaymentRepository repository;
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);
	@Autowired
	private PaymentService service = new PaymentService(repository);
	
	@GetMapping
	public List<Payment> findAll() {
		log.info("Se buscaron todos los payments");
		String response = "Hola, hoy es "+ new Date();
		log.info("response => "+ response);
		return this.service.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Payment findPaymentById(@PathVariable String id) {
		log.info("Buscando Payment con el id: "+ id);
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