package com.pluralsight;

public class Hovercraft extends Vehicles
{
    private double totalPassengerWeightLimit;
    private boolean helmetRequired;
    private boolean lifeJacketRequired;

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
