package com.pluralsight;

import com.pluralsight.finance.Valuable;

public abstract class FixedAsset implements Valuable
{
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue)
    {
        this.name = name;
        this.marketValue = marketValue;
    }

    protected String getName() {
        return name;
    }

    protected double getMarketValue() {
        return marketValue;
    }

    protected void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public abstract double getValue();

}
