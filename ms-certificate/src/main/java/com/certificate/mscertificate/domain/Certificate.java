package com.certificate.mscertificate.domain;

import javax.persistence.*;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    @Column(name = "certificate_id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cert_id;

    @Column(name = "certificate_name")
    private String cert_name;

    @Column(name = "certificate_type")
    private String cert_type;

    @Column(name = "certificate_title")
    private String cert_title;

    // Fecha de creación del certificado
    @Column(name = "certificate_date")
    private String cert_date;

    // Fecha de expiración del certificado
    @Column(name = "certificate_exp")
    private String cert_exp;

    public Certificate() {
    }

    public Certificate(Long cert_id, String cert_name, String cert_type, String cert_title, String cert_date, String cert_exp) {
        this.cert_id = cert_id;
        this.cert_name = cert_name;
        this.cert_type = cert_type;
        this.cert_title = cert_title;
        this.cert_date = cert_date;
        this.cert_exp = cert_exp;
    }

    public Long getCert_id() {
        return cert_id;
    }

    public void setCert_id(Long cert_id) {
        this.cert_id = cert_id;
    }

    public String getCert_name() {
        return cert_name;
    }

    public void setCert_name(String cert_name) {
        this.cert_name = cert_name;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_title() {
        return cert_title;
    }

    public void setCert_title(String cert_title) {
        this.cert_title = cert_title;
    }

    public String getCert_date() {
        return cert_date;
    }

    public void setCert_date(String cert_date) {
        this.cert_date = cert_date;
    }

    public String getCert_exp() {
        return cert_exp;
    }

    public void setCert_exp(String cert_exp) {
        this.cert_exp = cert_exp;
    }
}