package org.example;

// Polymorphism
//

class Animal {
    void eat() {
        System.out.println("Animal eat");
    }
}

abstract class AnimalGroup {
    abstract void eat();
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    void eat(String food) {
        System.out.println("Dog eat String " + food);
    }

    void eat(Integer food) {
        System.out.println("Dog eat Integer" + food);
    }

    Integer eat(Integer food, Integer food2) {
        System.out.println("Dog eat Integer " + food + " " + food2);
        return food + food2;
    }
    Integer eat(Integer food, String food2) {
        System.out.println("Dog eat Integer " + food + " " + food2);
        return food;
    }

    Integer eat(String food, Integer food2) {
        System.out.println("Dog eat Integer " + food + " " + food2);
        return food2;
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
