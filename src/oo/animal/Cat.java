package oo.animal;

public class Cat extends Animal 
{
    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Cat Noise Meow Meow");    
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Eating Com Nha");    
    }

    void Catch_The_Mouse()// Bắt Chuột
    {
        System.out.println("Catch the mouse");
    }

    void Climb()// Leo Trèo
    {
        System.out.println("Leo Cay");
        System.out.println("Leo Tuong");
    }

    
}
