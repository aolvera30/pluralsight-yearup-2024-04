package com.pluralsight;

public class Car extends Vehicles
{
    private String carType;

    public Car(int vin,String vehicleType,int numberOfPassengers,int cargoCapacity,int fuelCapacity,
                     String color,String carType)
    {
        // super = the parent class
        super(vin,vehicleType,numberOfPassengers,cargoCapacity,fuelCapacity,color);

        this.carType = carType;


    }


    public String getCarType()
    {
        return carType;
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }
}
