package com.productsmicroservice.SpringBoot_Products_Microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //("/microservice")
public class ProductsController {

    @GetMapping("/products")
    public List<String> products() {
        return List.of("Product 1", "Product 2", "Product 3");
    }

}
