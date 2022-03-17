package oo.tuan05.buoi09;

public class Cat extends Filine implements Pet
{
    @Override
    public void MakeNoise() 
    {
        System.out.println("Meow Moew");
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Eat Mouse");
    }

    @Override
    public void beDriendly() 
    {
        System.out.println("Ban vs Nguoi");
        
    }

    @Override
    public void play() 
    {
    System.out.println("Choi ");        
    }
    
}
