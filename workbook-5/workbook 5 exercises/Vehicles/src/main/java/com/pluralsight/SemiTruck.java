package com.pluralsight;

public class SemiTruck extends Vehicles
{
    private int numberOfWheels;
    private boolean sleeperCab;

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
}
