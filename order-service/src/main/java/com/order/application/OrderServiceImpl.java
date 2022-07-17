package com.order.application;

import java.util.List;
import java.util.Optional;

import com.order.domain.*;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository repository;
	
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
}