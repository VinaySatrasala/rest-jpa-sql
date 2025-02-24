package com.ust.rest_jpa_sql.service;

import com.ust.rest_jpa_sql.model.Product;
import com.ust.rest_jpa_sql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        productRepository.save(product);
        return product;
    }

}
