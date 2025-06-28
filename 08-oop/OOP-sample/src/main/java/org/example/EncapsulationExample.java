package org.example;

// Build:
// Software Development Kit
// library
// dependency

// Access Modifiers
// keyword: (shift + option + up/down)
// - public: can be accessed by any class in any package
// - default: can be accessed by classes in the same package
// - private: can only be accessed by the same class
// - protected: can be accessed by concrete classes

public class EncapsulationExample {
    // tab >< shift + tab
    // shift + cmd + up/down

    // cmd + left/right
    // cmd + up/down
//    public static void main(String[] args) {
//        StaticCar car = new StaticCar();
//        car.drive();
//        car.newMethod("red");
//    }

    public static class StaticCar {
        public static void drive() {
            System.out.println("Static Car drive");
        }
    }
}
