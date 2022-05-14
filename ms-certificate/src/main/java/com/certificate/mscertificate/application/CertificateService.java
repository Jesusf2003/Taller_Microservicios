package com.certificate.mscertificate.application;

import com.certificate.mscertificate.domain.Certificate;
import com.certificate.mscertificate.domain.CertificateRepository;
import com.certificate.mscertificate.infraestructure.CertificatePSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService implements CertificatePSQL {

    @Autowired
    CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    @Override
    public List<Certificate> findAll() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate create(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate update(Certificate certificate) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(certificate.getCert_id());
        if (!optionalCertificate.isPresent()) {
            throw new RuntimeException("No se encontró el certificado ac actualizar.");
        }
        return certificateRepository.save(certificate);
    }

    @Override
    public void delete(Long id) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(id);
        if (!optionalCertificate.isPresent()) {
            throw new RuntimeException("No se encontró el certificado a eliminar.");
        }
        certificateRepository.deleteById(id);
    }
}