package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create an ArrayList of Asset objects
        ArrayList<Asset> assets = new ArrayList<>();

        // two House objects
        assets.add(new House("My house", "2020-05-15", 250000, "123 Main St", 2, 2000, 5000));
        assets.add(new House("Vacation home", "2018-08-23", 350000, "456 Lake Rd", 1, 3000, 10000));

        // two Vehicle objects
        assets.add(new Vehicle("Tom's truck", "2019-06-01", 30000, "Ford F-150", 2019, 45000));
        assets.add(new Vehicle("My car", "2017-09-14", 22000, "Honda Civic", 2017, 75000));

        for (Asset asset : assets) {
            // Display the description, date acquired, original cost, and value
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Use instanceof to determine the type of asset
            if (asset instanceof House) {
                House house = (House) asset; // Downcast to House
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset; // Downcast to Vehicle
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }

            // Print a separator for readability
            System.out.println("--------------------------------------");
        }
    }

}
