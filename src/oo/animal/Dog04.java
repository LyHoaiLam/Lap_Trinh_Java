package oo.animal;

public class Dog04 extends Animal
{
    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Dog Noise");    
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Dog Eat Com Nha");    
    }

    public void ProtectHouse()// Coi Nhà
    {
        System.out.println("Protecting");
    }

    public void Chase_Cat()// Rược Mèo
    {
        System.out.println("Catch cats");
    }


}
