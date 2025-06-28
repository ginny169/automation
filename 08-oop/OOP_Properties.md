# Object-Oriented Programming (OOP) Properties

## 1. Abstraction
Abstraction is the concept of hiding complex implementation details and showing only the necessary features of an object. It helps in reducing programming complexity and effort.

### Example:
```java
// Abstract class
abstract class Vehicle {
    // Abstract method - implementation details hidden
    public abstract void start();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Vehicle information");
    }
}
```

### Key Points:
- Hides complex implementation details
- Shows only essential features
- Reduces complexity
- Makes code more maintainable

## 2. Polymorphism
Polymorphism means "many forms" and allows objects of different classes to be treated as objects of a common superclass. It enables one interface to be used for a general class of actions.

### Example:
```java
// Parent class
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting");
    }
}

// Child classes with different implementations
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starting");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle engine starting");
    }
}
```

### Key Points:
- Same interface, different implementations
- Method overriding
- Runtime polymorphism
- Code reusability

## 3. Inheritance
Inheritance is a mechanism that allows a class to inherit properties and methods from another class. It promotes code reusability and establishes a relationship between classes.

### Example:
```java
// Parent class
class Vehicle {
    protected String brand;
    protected String model;
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, String model, int doors) {
        this.brand = brand;    // Inherited from Vehicle
        this.model = model;    // Inherited from Vehicle
        this.numberOfDoors = doors;
    }
}
```

### Key Points:
- Code reusability
- Establishes parent-child relationship
- Single and multiple inheritance
- Method overriding

## 4. Encapsulation
Encapsulation is the bundling of data and methods that operate on that data within a single unit (class). It restricts direct access to some of an object's components.

### Example:
```java
class Vehicle {
    // Private fields (data hiding)
    private String brand;
    private String model;
    private int year;
    
    // Public methods to access private fields
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // Other getters and setters
}
```

### Key Points:
- Data hiding
- Controlled access through methods
- Increased security
- Better code organization

## Benefits of OOP
1. **Modularity**: Code can be organized into reusable components
2. **Maintainability**: Easier to maintain and modify code
3. **Reusability**: Code can be reused across different parts of an application
4. **Scalability**: Easy to extend and add new features
5. **Security**: Better control over data access and manipulation

## Best Practices
1. Keep classes focused and single-purpose
2. Use meaningful names for classes and methods
3. Implement proper access modifiers
4. Follow the DRY (Don't Repeat Yourself) principle
5. Use interfaces for better abstraction
6. Document your code properly 