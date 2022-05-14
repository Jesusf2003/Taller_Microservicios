package com.certificate.mscertificate.rest;

import com.certificate.mscertificate.application.CertificateService;
import com.certificate.mscertificate.domain.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-certificate/v1/certificates")
public class CertificateController {

    @Autowired
    CertificateService certificateService;

    @GetMapping
    public List<Certificate> findAll() {
        return certificateService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Certificate create(@RequestBody Certificate certificate) {
        return certificateService.create(certificate);
    }

    @PutMapping
    public Certificate update(@RequestBody Certificate certificate) {
        return certificateService.update(certificate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        certificateService.delete(id);
    }
}