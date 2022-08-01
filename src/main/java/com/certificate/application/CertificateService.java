package com.certificate.application;

import java.util.List;

import com.certificate.domain.Certificate;
import com.certificate.domain.CertificateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CertificateService {

	@Autowired
	private CertificateRepository repository;
	
	public List<Certificate> findAll() {
		return this.repository.findAll();
	}
	
	public Certificate findCertificateById(String id) {
		return this.repository.findCertificateById(id);
	}
	
	public Certificate create(Certificate data) {
		return this.repository.create(data);
	}
	
	public ResponseEntity<?> update(Certificate data) {
		this.repository.update(data);
		return new ResponseEntity<>("Certificado modificado", HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> delete(String id) {
		this.repository.delete(id);
		return new ResponseEntity<>("Certificado eliminado", HttpStatus.OK);
	}
}