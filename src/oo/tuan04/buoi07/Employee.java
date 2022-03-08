package oo.tuan04.buoi07;
import oo.tuan04.buoi07.testprotected.*;
public class Employee extends Person

{
    private double salary;


    public Employee()
    {

    }

    public Employee(String name, String birth,double salary)
    {
        super(name, birth);
        this.salary = salary;
    }

    void setEmloyee(double salary)
    {
        this.salary = salary;
    }

    double getEmloyee()
    {
        return this.salary;
    }
    @Override
    public String toString() 
    {
        return " Emloyee [ salary = " + salary + " ] " + " Name " + this.name + " birthday: " + this.birthday;    
        //super.toString()// Gọi toString cua class cha ( Person ) vs điều kiện toString của class phải Protected
    }

    
}
