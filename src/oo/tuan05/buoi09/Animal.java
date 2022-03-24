package oo.tuan05.buoi09;

 public abstract class Animal 
{
    private String name;
    private String picture;
    private String food;
    private int hunger;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    
    
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


    public abstract void MakeNoise();
    
    protected void Sleep()
    {
        System.out.println("Sleeping");
    }

    protected abstract void Eat();
   
    protected void Roam()
    {
        System.out.println("Running");
    }
    
}
