package com.pluralsight;

public class Vehicles
{
    private int vin;
    private String vehicleType;
    private int numberOfPassengers;
    private int  cargoCapacity;
    private int fuelCapacity;
    private String color;

    public int getVin()
    {
        return vin;
    }

    public void setVin(int vin)
    {
        this.vin = vin;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfPassengers()
    {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers)
    {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity()
    {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
