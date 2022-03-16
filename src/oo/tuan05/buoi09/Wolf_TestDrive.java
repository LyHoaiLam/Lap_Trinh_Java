package oo.tuan05.buoi09;

public class Wolf_TestDrive 
{
    public static void main(String[] args) 
    {
        //Animal animal1 = new Animal(); abstrac trc tên Class Animal nên không tạo đc tối tượng Animal
        Wolf wolf = new Wolf();    
        //Canine canine1 = new Canine();
        Animal nAnimal = new Hippo();
        Hippo hippo = new Hippo();

        Filine filine = new Lion();
        Animal animal = new Lion();
        Lion lion = new Lion();


        Animal animal2 = new Tiger();
        Tiger tiger = new Tiger();
        Filine filine2 = new Tiger();

        Animal animal23 = new Dog();
        Canine canine = new Dog();
        Dog dog = new Dog();

        Animal animal3 = new Wolf();
        Wolf wolf2 = new Wolf();
        Canine canine2 = new Wolf();
        
    }    
}
