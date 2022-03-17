package oo.tuan05.buoi09;

public class Dog extends Canine implements Pet, Interface_Name
{
    @Override
    protected void MakeNoise() 
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setName(String name) 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getName() 
    {
        // TODO Auto-generated method stub
        
    }
}
