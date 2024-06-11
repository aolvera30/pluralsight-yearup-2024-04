package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 0) {
                break;
            }

            switch (option) {
                case 1:
                    dbHandler.displayAllProducts();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
