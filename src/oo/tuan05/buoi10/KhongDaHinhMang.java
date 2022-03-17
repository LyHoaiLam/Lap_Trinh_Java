package oo.tuan05.buoi10;

import oo.tuan05.buoi09.Cat;
import oo.tuan05.buoi09.Dog;

public class KhongDaHinhMang 
{
    public static void main(String[] args) 
    {
        // quan ly cho
        Dog dsDog[] = new Dog[2];
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dsDog[0] = dog;
        dsDog[1] = dog2;

        for (Dog d : dsDog) 
        {
            d.MakeNoise();
        }

        // quan ly meo
        Cat dsCat[] = new Cat[2];
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsCat[0] = cat;
        dsCat[1] = cat2;

        for (Cat c : dsCat) 
        {
            cat.MakeNoise();
            
        }



    }    
}
