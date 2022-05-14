package com.payment.mspayment.domain;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @Column(name = "payment_id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @Column(name = "payment_cnumber")
    private String card_number;

    @Column(name = "payment_cname")
    private String card_name;

    @Column(name = "payment_edate")
    private String expiry_date;

    @Column(name = "payment_scode")
    private String security_code;

    public Payment() {
    }

    public Payment(Long payment_id, String card_number, String card_name, String expiry_date, String security_code) {
        this.payment_id = payment_id;
        this.card_number = card_number;
        this.card_name = card_name;
        this.expiry_date = expiry_date;
        this.security_code = security_code;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }
}