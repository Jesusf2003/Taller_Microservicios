package com.product.msproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.msproduct.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}