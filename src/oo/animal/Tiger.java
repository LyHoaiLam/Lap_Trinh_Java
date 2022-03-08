package oo.animal;

public class Tiger extends Feline
{
   
    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Tiger Noise");    
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Tiger Eat Meat");    
    }
}
