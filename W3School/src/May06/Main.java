package May06;

import May05.Pig;

import java.util.concurrent.Callable;

public class Main {

    public static void main( String[] args){
//        Person p1 = new Person();
//
//        p1.setName("Hasnain");
//        System.out.println(p1.getName());

//        Vehicle myCar = new Vehicle();
//        Car myCar = new Car();
//
//        myCar.honk();
//        System.out.println(myCar.brand +" "+ myCar.modelName);

        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
