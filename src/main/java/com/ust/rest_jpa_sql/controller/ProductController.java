package com.ust.rest_jpa_sql.controller;

import com.ust.rest_jpa_sql.model.Product;
import com.ust.rest_jpa_sql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @RequestMapping(path = "/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Product> createProducts(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.addProduct(product));
    }

    @GetMapping
    @RequestMapping("/all")
    private ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok().body(productService.findAll());
    }

}
