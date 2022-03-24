package oo.tuan06.buoi11;

import java.util.ArrayList;
import java.util.List;

import oo.tuan05.buoi09.Animal;
import oo.tuan05.buoi09.Dog;

public class DanhSachThu 
{
    private List<Animal> dsAnimal = new ArrayList<>();
    
    public void them(Animal animal)
    {
        dsAnimal.add(animal);
    }

    public Animal timKiemTheoTen(String name)
    {
        Animal animal = null;

        for (Animal animal2 : dsAnimal) 
        {
            if(animal.getName().equals(name))
            {
                animal = animal2;
            }    
        }
        return animal;

        
    }

    public Animal timKiemTheoTenDog(String name)
    {
        Animal animal = null;

        for (Animal a : dsAnimal) 
        {
            if(a.getName().equals(name) && a instanceof Dog)
            {
                animal = a;
            }    
        }
        return animal;

        
    }

    public Dog timKiemTheoTenDogTraVeKieuDog(String name)
    {
        Dog dog = null;

        for (Animal a : dsAnimal) 
        {
            if(a.getName().equals(name) && a instanceof Dog)
            {
                dog = (Dog) a;
            }    
        }
        return dog;

        
    }
}
