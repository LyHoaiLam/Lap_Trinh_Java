package onlaibaihoc.animal;

public class Dog_OnLai extends Animal_OnLai
{
    @Override
    protected void make_Noise() 
    {
        // TODO Auto-generated method stub
        System.out.println("Dog Noise");
    }

    @Override
    protected void eat() 
    {
        // TODO Auto-generated method stub
        System.out.println("Dog Eat");
    }

    public void RuocMeo()
    {
        System.out.println("Ruoc Bat Meo");
    }

    public void GiuNha()
    {
        System.out.println("Giu Nha");
    }
}
