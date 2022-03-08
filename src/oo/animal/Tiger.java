package oo.animal;

public class Tiger extends Animal 
{
    public void Nup_Bui()
    {
        System.out.println("Nup Bui Rinh Con Moi");
    }

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
