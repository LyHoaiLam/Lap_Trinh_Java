package oo.tuan05.buoi09;

public class Dog extends Canine implements Pet, Interface_Name
{
    @Override
    public void MakeNoise() 
    {
        System.out.println("GAU GAU");        
    }   

    @Override
    protected void Eat() 
    {
        System.out.println("An Com ");        
    }

    @Override
    public void beDriendly() 
    {
        System.out.println("Ban vs Nguoi");
        
    }

    @Override
    public void play() 
    {
        
    }

    @Override
    public void setName(String name) 
    {
        
    }

    
   
}
