package com.payment.mspayment.domain;

public class Payment {

    private Long id;
    private String card_number;
    private String card_name;
    private String expiry_date;
    private String scurity_code;

    public Payment() {
    }

    public Payment(Long id, String card_number, String card_name, String expiry_date, String scurity_code) {
        this.id = id;
        this.card_number = card_number;
        this.card_name = card_name;
        this.expiry_date = expiry_date;
        this.scurity_code = scurity_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getScurity_code() {
        return scurity_code;
    }

    public void setScurity_code(String scurity_code) {
        this.scurity_code = scurity_code;
    }
}