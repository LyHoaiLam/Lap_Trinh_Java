package oo.animal;

public class Lion extends Feline
{
    @Override// Ghi de
    protected void MakeNoise() 
    {
        System.out.println("Making Lion Noise");        
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Lion Eat Meat");    
    }


}
