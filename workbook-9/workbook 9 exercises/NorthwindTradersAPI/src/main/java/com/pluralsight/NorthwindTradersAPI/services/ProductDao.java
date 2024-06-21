package com.pluralsight.NorthwindTradersAPI.services;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import java.util.List;
import java.util.Optional;

public interface ProductDao {
    List<Product> getAllProducts();
    Optional<Product> getProductById(int id);
}