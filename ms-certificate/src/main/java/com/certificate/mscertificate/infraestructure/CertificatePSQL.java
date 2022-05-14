package com.certificate.mscertificate.infraestructure;

import com.certificate.mscertificate.domain.Certificate;

import java.util.List;

public interface CertificatePSQL {

    List<Certificate> findAll();

    Certificate create(Certificate certificate);

    Certificate update(Certificate certificate);

    void delete(Long id);
}