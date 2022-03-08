package oo.tuan04.buoi07.testprotected;

public class Person 
{
    protected String name;
    protected String birthday;

    public Person()
    {

    }

    public Person(String name, String Birth)
    {
        this.name = name;
        this.birthday = Birth;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setbirht(String birth)
    {
        this.name = birth;
    }

    public String getname()
    {
        return this.name;
    }

    
    public String getbirth()
    {
        return this.birthday;
    }

    @Override
    public String toString() 
    {
        return "Person [ Birthday = " + birthday + " Name " + name + " ] ";    
    }


  

}
