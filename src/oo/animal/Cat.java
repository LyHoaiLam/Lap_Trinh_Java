package oo.animal;

public class Cat extends Canini
{
    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Cat Noise Meow Meow");    
    }

    @Override
    protected void Eat() {
        // TODO Auto-generated method stub
        super.Eat();
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

    void chase_Butterfly()
    {
        System.out.println("Bat Buom");
    }

    
}
