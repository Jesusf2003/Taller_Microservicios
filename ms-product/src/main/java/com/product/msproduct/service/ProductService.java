package com.product.msproduct.service;

import java.util.List;

import com.product.msproduct.model.Product;

public interface ProductService {
    
    List<Product> findAll();

    Product create(Product product);

    Product update(Product product);

    void delete(Long id);
}