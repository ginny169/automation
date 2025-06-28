package newPackage;

import org.example.Car;
interface A {
    void drive();
}
class B implements A {
    @Override
    public void drive() {
        System.out.println("B drive");
    }
}
public class HondaCity extends Car {

    public void hondaCityDrive(){
        protectedDrive();
    }
}
