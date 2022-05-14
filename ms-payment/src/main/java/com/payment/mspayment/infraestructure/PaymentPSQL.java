package com.payment.mspayment.infraestructure;

import com.payment.mspayment.domain.Payment;

import java.util.List;

public interface PaymentPSQL {

    List<Payment> findAll();

    Payment create(Payment payment);

    Payment update(Payment payment);

    void delete(Long id);
}