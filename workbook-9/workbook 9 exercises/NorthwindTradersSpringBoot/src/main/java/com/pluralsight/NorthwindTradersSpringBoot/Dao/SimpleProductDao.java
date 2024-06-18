package com.pluralsight.NorthwindTradersSpringBoot.Dao;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    // Constructor to add initial products to the list
    public SimpleProductDao() {
        products.add(new Product(1, "Water Bottle", "Outdoor", 15.0));
        products.add(new Product(2, "Headphones", "Electronics", 50.0));
        products.add(new Product(3, "Yoga Mat", "Fitness", 25.0));
        products.add(new Product(4, "LED Bulb", "Home", 30.0));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }
}