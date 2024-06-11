package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler
{
    private static final String connectionString = "jdbc:mysql://localhost:3306/northwind";
    private static final String username = "root";
    private static final String password = "YUm15510n";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //establishes connection to talk to database
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void displayAllProducts() {
        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {  //pass in variables to get connection to desired data
            String sql = """
                    SELECT ProductId
                    ,ProductName
                    ,UnitPrice   
                    ,UnitsInStock 
                    FROM products;
                    """;
            Statement statement = connection.createStatement(); // establishes connection to be able to query
            ResultSet resultSet = statement.executeQuery(sql); // executes query and stores results

            while (resultSet.next()) {
                int id = resultSet.getInt("ProductId");
                String name = resultSet.getString("ProductName");
                double price = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");

                System.out.printf("Product Id: %d%n", id);
                System.out.printf("Name: %s%n", name);
                System.out.printf("Price: %.2f%n", price);
                System.out.printf("Stock: %d%n", unitsInStock);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void displayAllCustomers() {
        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            String sql = """
                    SELECT ContactName
                    ,CompanyName
                    ,City
                    ,Country
                    ,Phone
                    FROM customers
                    ORDER BY Country;
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phone = resultSet.getString("Phone");

                System.out.printf("Contact Name: %s%n", contactName);
                System.out.printf("Company Name: %s%n", companyName);
                System.out.printf("City: %s%n", city);
                System.out.printf("Country: %s%n", country);
                System.out.printf("Phone: %s%n", phone);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

