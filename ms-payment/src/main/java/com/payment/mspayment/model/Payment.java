package com.payment.mspayment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payment")
public class Payment {

    @Id
    private String id;
}