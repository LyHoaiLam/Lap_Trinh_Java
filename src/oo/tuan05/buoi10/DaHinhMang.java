package oo.tuan05.buoi10;

import oo.tuan05.buoi09.Animal;
import oo.tuan05.buoi09.Cat;
import oo.tuan05.buoi09.Dog;
import oo.tuan05.buoi09.Pet;

public class DaHinhMang 
{
    public static void main(String[] args) 
    {
        Animal dsAnimal[] = new Animal[4];
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsAnimal[0] = dog;
        dsAnimal[1] = dog2;

        dsAnimal[2] = cat;
        dsAnimal[3] = cat2;

        for (Animal animal : dsAnimal) 
        {
            //if(animal instanceof Cat)// chỉ mèo đc kiêu
            //{ Gởi đi cùng 1 thông điệp ( Lúc chương trình đang chạy ). ( Thay đổi code trong lúc chạy )
                animal.MakeNoise();// Kết Quả Đa Hình
            //
        }
        Pet pet[] = new Pet[2];

        /*for (Pet p: pet) 
        {
            p.beDriendly();
            p.play();
        }*/


    }    
}
