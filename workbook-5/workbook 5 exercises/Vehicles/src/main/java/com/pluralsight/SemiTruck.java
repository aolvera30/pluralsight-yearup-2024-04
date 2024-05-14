package com.pluralsight;

public class SemiTruck extends Vehicles
{
    private int numberOfWheels;
    private boolean sleeperCab;

    public SemiTruck(int vin,String vehicleType,int numberOfPassengers,int cargoCapacity,int fuelCapacity,
                      String color,int numberOfWheels,boolean sleeperCab)
    {
        // super = the parent class
        super(vin,vehicleType,numberOfPassengers,cargoCapacity,fuelCapacity,color);

        this.numberOfWheels = numberOfWheels;
        this.sleeperCab = sleeperCab;

    }



    public boolean isSleeperCab()
    {
        return sleeperCab;
    }

    public void setSleeperCab(boolean sleeperCab)
    {
        this.sleeperCab = sleeperCab;
    }

    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "SemiTruck{" +
                "vin=" + getVin() +
                ", vehicleType='" + getVehicleType() + '\'' +
                ", numberOfPassengers=" + getNumberOfPassengers() +
                ", cargoCapacity=" + getCargoCapacity() +
                ", fuelCapacity=" + getFuelCapacity() +
                ", color='" + getColor() + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", sleeperCab=" + sleeperCab +
                '}';
    }
}
