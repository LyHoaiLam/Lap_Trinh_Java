package oo.animal;

public class Animal 
{
    // Attribute
    private String picture;
    private String food;
    private int hunger;
    
    void set_Picture(String picture)
    {
        this.picture = picture;
    }

    String get_Picture()
    {
        return this.picture;
    }


    void set_Food(String Food)
    {
        this.food = food;
    }

    String get_Fodd()
    {
        return this.food;
    }
    

    void set_Hunger(int hunger)
    {
        this.hunger = hunger;
    }

    int get_Hunger()
    {
        return this.hunger;
    }

    // Behavior

    protected void MakeNoise()// Tiếng Kiêu
    {
        System.out.println("Make Noise");
    }

    protected void Sleep()// Ngủ
    {
        System.out.println("Sleeping");
    }

    protected void Eat()// Ăn
    {
        System.out.println("Eating");
    }

    protected void Roam()// Đi Lang Thang
    {
        System.out.println("Running");
    }

}
