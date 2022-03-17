package oo.tuan05.buoi09;

public class Cat extends Filine implements Pet
{
    @Override
    protected void MakeNoise() 
    {
        System.out.println("6666666666666");
    }

    @Override
    protected void Eat() 
    {
        System.out.println("999999999999999999999");
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
