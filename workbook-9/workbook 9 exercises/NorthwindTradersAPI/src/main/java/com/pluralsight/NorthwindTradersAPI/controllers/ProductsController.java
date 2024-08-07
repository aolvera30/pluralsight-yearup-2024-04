package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.services.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {

    private final ProductDao productDao;

    @Autowired
    public ProductsController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productDao.getProductById(id);
    }
}