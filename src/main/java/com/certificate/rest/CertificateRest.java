package com.certificate.rest;

import java.util.List;

import com.certificate.application.CertificateService;
import com.certificate.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/certificate")
public class CertificateRest {

	private CertificateRepository repository;
	@Autowired
	private CertificateService service = new CertificateService(repository);
	
	@GetMapping
	public List<Certificate> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Certificate findById(@PathVariable String id) {
		return this.service.findCertificateById(id);
	}
	
	@PostMapping
	public Certificate save(@RequestBody Certificate data) {
		return this.service.create(data);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Certificate data) {
		return this.service.update(data);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return this.service.delete(id);
	}
}