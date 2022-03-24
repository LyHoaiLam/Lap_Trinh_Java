package oo.tuan06.buoi11;

import oo.tuan05.buoi09.Cat;
import oo.tuan05.buoi09.Dog;

public class Vet_TestDrive 
{
    public static void main(String[] args) 
    {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        vet.giveShort(dog);
        vet.giveShort(cat);
    }    
}
