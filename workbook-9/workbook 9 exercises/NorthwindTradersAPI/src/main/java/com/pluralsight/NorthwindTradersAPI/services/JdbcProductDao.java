package com.pluralsight.NorthwindTradersAPI.services;


import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class JdbcProductDao implements ProductDao {

    private final DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT id, name, categoryId, unitPrice FROM products;";

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Product product = mapRowToProduct(resultSet);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    @Override
    public Optional<Product> getProductById(int id) {
        String sql = "SELECT id, name, categoryId, unitPrice FROM products WHERE id = ?;";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return Optional.of(mapRowToProduct(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    private Product mapRowToProduct(ResultSet row) throws SQLException {
        int id = row.getInt("id");
        String name = row.getString("name");
        int categoryId = row.getInt("categoryId");
        double unitPrice = row.getDouble("unitPrice");

        return new Product(id, name, categoryId, unitPrice);
    }
}