package oo.animal;

public class Hippo extends Animal 
{
    void lies_Under_Water()// Năm Dưới Nước
    {
        System.out.println("Lying Under The Water");
    }   

    @Override
    protected void MakeNoise() 
    {
        System.out.println("Making Hippo Noise");    
    }

    @Override
    protected void Eat() 
    {
        System.out.println("Hippo Eat Herbivorous");    
    }
}
