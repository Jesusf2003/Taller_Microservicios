package com.certificate.domain;

import java.util.List;

public interface CertificateRepository {
	
	List<Certificate> findAll();
	
	Certificate findCertificateById(String id);
	
	Certificate create(Certificate data);
	
	void update(Certificate data);
	
	void delete(String data);
}