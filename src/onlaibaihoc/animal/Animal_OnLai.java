package onlaibaihoc.animal;

public abstract class Animal_OnLai 
{
    private String picture;
    private String food;
    private int hunger;

    Animal_OnLai()
    {

    }

    Animal_OnLai(String picture, String food, int hunger)
    {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
    }
    
    protected abstract void make_Noise();
    {
        System.out.println("Making Noise..........");
    }

    protected void sleep()
    {
        System.out.println("Sleping..............");
    }

     protected abstract void eat ();

    protected void roam()
    {
        System.out.println("Roaming.................");
    }


}
