package com.pluralsight.NorthwindTradersAPI.services;


import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDaoImplementation implements ProductDao {

    private List<Product> products = new ArrayList<>();

    public ProductDaoImplementation() {
        // Adding sample products
        products.add(new Product(1, "Apple iPhone 13", 1, 799.99));
        products.add(new Product(2, "Samsung Galaxy S21", 1, 699.99));
        products.add(new Product(3, "Google Pixel 6", 2, 599.99));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return products.stream()
                .filter(product -> product.getProductId() == id)
                .findFirst();
    }
}