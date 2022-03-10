package oo.animal;

public class Wolf extends Canini
{
    public void Kieu_Hu()
    {
        System.out.println("HUUUUUUUUUUUUUUUUUUUUUUUUU");
    }
    @Override
    protected void Roam() 
    {
        System.out.println("Di Lang Thang Theo Dan");    
    }

    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Wolf Wolf");    
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Wolf Eat Meat");    
    }
}
