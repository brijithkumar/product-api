package com.atob.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts(){
        List<String> products = new ArrayList<>();
        products.add("Product 1");
        products.add("Product 2");
        products.add("Product 3");
        return products;
    }
}
