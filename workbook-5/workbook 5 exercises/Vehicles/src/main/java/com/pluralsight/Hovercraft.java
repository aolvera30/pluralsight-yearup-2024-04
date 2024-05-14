package com.pluralsight;

public class Hovercraft extends Vehicles
{
    private double totalPassengerWeightLimit;
    private boolean helmetRequired;
    private boolean lifeJacketRequired;

    public Hovercraft(int vin,String vehicleType,int numberOfPassengers,int cargoCapacity,int fuelCapacity,
                     String color, double totalPassengerWeightLimit,boolean helmetRequired,boolean lifeJacketRequired)
    {
        // super = the parent class
        super(vin,vehicleType,numberOfPassengers,cargoCapacity,fuelCapacity,color);

        this.totalPassengerWeightLimit = totalPassengerWeightLimit;
        this.helmetRequired = helmetRequired;
        this.lifeJacketRequired = lifeJacketRequired;

    }


    public double getTotalPassengerWeightLimit()
    {
        return totalPassengerWeightLimit;
    }

    public void setTotalPassengerWeightLimit(double totalPassengerWeightLimit)
    {
        this.totalPassengerWeightLimit = totalPassengerWeightLimit;
    }

    public boolean isHelmetRequired()
    {
        return helmetRequired;
    }

    public void setHelmetRequired(boolean helmetRequired)
    {
        this.helmetRequired = helmetRequired;
    }

    public boolean isLifeJacketRequired()
    {
        return lifeJacketRequired;
    }

    public void setLifeJacketRequired(boolean lifeJacketRequired)
    {
        this.lifeJacketRequired = lifeJacketRequired;
    }
}
