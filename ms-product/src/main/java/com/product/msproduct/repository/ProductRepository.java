package com.product.msproduct.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.msproduct.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}