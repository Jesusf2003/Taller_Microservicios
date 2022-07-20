package com.order.application;

import java.util.List;
import java.util.Optional;

import com.order.domain.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private static final Logger log = LoggerFactory.getLogger("outbound-logs");
	
	@Autowired
	private OrderRepository repository;
	
	@Qualifier("com.order.domain.ProductClient")
	@Autowired
	ProductClient cliProd;
	
	@Qualifier("com.order.domain.PaymentClient")
	@Autowired
	PaymentClient cliPay;
	
	@Override
	public List<Order> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Order> findOrderById(String id) {
		return this.repository.findById(id);
	}

	@Override
	public Order create(Order order) {
		System.out.println(order.toString());
		return this.repository.save(order);
	}

	@Override
	public void update(Order order) {
		this.repository.save(order);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

	@Override
	public Product findProductById(String id) {
		
		Product optProduct = cliProd.findProductById(id);
		
		if (optProduct == null) {
			log.error("No se pudo encontrar el producto");
			return null;
		}
		
		return optProduct;
	}

	@Override
	public Payment findPaymentById(String id) {
		
		Payment optPayment = cliPay.findPaymentById(id);
		
		if(optPayment == null) {
			log.error("No se pudo encontrar el pago");
			return null;
		}
		return optPayment;
	}
}