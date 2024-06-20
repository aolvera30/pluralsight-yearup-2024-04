package com.pluralsight.NorthwindTradersAPI.services;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoryDaoImplementation implements CategoryDao {

    private List<Category> categories = new ArrayList<>();

    public CategoryDaoImplementation() {
        // Adding some sample categories
        categories.add(new Category(1, "Electronics"));
        categories.add(new Category(2, "Home Appliances"));
        categories.add(new Category(3, "Books"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Optional<Category> getCategoryById(int id) {
        return categories.stream()
                .filter(category -> category.getCategoryId() == id)
                .findFirst();
    }
}
