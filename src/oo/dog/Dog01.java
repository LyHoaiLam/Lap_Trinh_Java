package oo.dog;

public class Dog01 
{
    private int size;// implementation
    String name;
    String breed;

    public void setSize(int size)
    {
        if(size > 0)
        {
            this.size = size;
        }
        else
        {
            System.out.println("Khong hop le");
        }
    }

    public int getSize()
    {
        return this.size;
    }

}
