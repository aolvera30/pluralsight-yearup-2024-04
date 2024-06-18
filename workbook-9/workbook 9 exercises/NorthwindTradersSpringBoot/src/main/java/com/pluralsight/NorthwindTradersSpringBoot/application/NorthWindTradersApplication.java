package com.pluralsight.NorthwindTradersSpringBoot.application;

import com.pluralsight.NorthwindTradersSpringBoot.Dao.SimpleProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class NorthWindTradersApplication {

    public static void main(String[] args) {
        // Load the Spring application context from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the SimpleProductDao bean from the application context
        SimpleProductDao simpleProductDao = context.getBean(SimpleProductDao.class);

        // Create a user interface
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // List Products
                    List<Product> products = simpleProductDao.getAll();
                    for (Product product : products) {
                        System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getName() + ", Category: " + product.getCategory() + ", Price: " + product.getPrice());
                    }
                    break;
                case 2:
                    // Add Product
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Product Category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    Product newProduct = new Product(id, name, category, price);
                    simpleProductDao.add(newProduct);
                    System.out.println("Product added successfully!");
                    break;
                case 3:
                    // Exit
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
