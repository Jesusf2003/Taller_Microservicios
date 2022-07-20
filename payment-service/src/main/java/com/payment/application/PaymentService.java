package com.payment.application;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.json.simple.*;
import com.payment.domain.*;

import org.json.simple.parser.JSONParser;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentService {

	private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
	
	@Autowired
	private PaymentRepository repository;
	
	public List<Payment> findAll() {
		return this.repository.findAll();
	}
	
	public Payment findPaymentById(String id) {
		return this.repository.findPaymentById(id);
	}
	
	public Payment create(Payment payment) {
		return this.repository.create(payment);
	}
	
	public ResponseEntity<?> update(Payment payment) {
		this.repository.update(payment);
		return new ResponseEntity<String>("Pago actualizado", HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> delete(String id) {
		this.repository.delete(id);
		return new ResponseEntity<String>("Pago eliminado", HttpStatus.OK);
	}
}