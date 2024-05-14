package com.pluralsight;

public class Moped extends Vehicles
{
    private int weightLimit;

    public Moped(int vin,String vehicleType,int numberOfPassengers,int cargoCapacity,int fuelCapacity,
                     String color,int weightLimit)

    {
        // super = the parent class
        super(vin, vehicleType, numberOfPassengers, cargoCapacity, fuelCapacity, color);

        this.weightLimit = weightLimit;

    }


    public int getWeightLimit()
    {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit)
    {
        this.weightLimit = weightLimit;
    }
}
