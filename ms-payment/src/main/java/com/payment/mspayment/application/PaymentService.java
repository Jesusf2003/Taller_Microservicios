package com.payment.mspayment.application;

import com.payment.mspayment.domain.Payment;
import com.payment.mspayment.domain.PaymentRepository;
import com.payment.mspayment.infraestructure.PaymentPSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService implements PaymentPSQL {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        Optional<Payment> optionalPayment = paymentRepository.findById(payment.getId());
        if (!optionalPayment.isPresent()) {
            throw new RuntimeException("No se encontró el pago a actualizar");
        }
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Long id) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (!optionalPayment.isPresent()) {
            throw new RuntimeException("No se encontró el pago a eliminar");
        }
        paymentRepository.deleteById(id);
    }
}