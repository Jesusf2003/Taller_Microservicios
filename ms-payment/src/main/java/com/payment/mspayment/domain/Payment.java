package com.payment.mspayment.domain;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private Long id;
    private String card_number;
    private String card_name;
    private String expiry_date;
    private String security_code;
}