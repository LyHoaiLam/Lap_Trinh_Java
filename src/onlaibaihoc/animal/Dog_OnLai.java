package onlaibaihoc.animal;

public class Dog_OnLai extends Canine_OnLai implements Pet_OnLai
{
    @Override
    protected void make_Noise() 
    {
        System.out.println("Dog Noise");
    }

    @Override
    protected void eat() 
    {
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

    @Override
    public void beFiendLy() 
    {
        System.out.println("Ban Than VS Con Nguoi");
    }

    @Override
    public void play_With_Human() 
    {
        System.out.println("Choi Dua VS Con Nguoi");
    }

    
}
