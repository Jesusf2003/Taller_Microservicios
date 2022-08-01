package com.certificate.infraestructure;

import java.util.List;

import com.certificate.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CertificateServiceImpl implements CertificateRepository {
	
	@Autowired
	private final MongoOperations operations;

	@Override
	public List<Certificate> findAll() {
		return this.operations.findAll(Certificate.class);
	}

	@Override
	public Certificate findCertificateById(String id) {
		return this.operations.findById(new Query(Criteria.where("id").is(id)), Certificate.class);
	}

	@Override
	public Certificate create(Certificate data) {
		return this.operations.save(data);
	}

	@Override
	public void update(Certificate data) {
		this.operations.save(data);
	}

	@Override
	public void delete(String data) {
		this.operations.findAndRemove(new Query(Criteria.where("id").is(data)), Certificate.class);
	}
}