package oo;

public class Car 
{
    private String carColor;
    private double carPrice;
    
    public String getCarColor(String color)
    {
        this.carColor = color;
        return this.carColor;
    }

    public double getCarPrice(double price )
    {
        this.carPrice = price;
        return this.carPrice;
    }

    public void print()
    {
        System.out.println("Car Color: "+ this.carColor);
        System.out.println("Car Price: "+ this.carPrice);
    }
}
