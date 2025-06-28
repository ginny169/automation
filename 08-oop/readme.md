# OOP

## Exercise 1: Library Management System

Create a simple library management system using OOP principles. The system should handle books and library members.

Requirements:
1. Create a `Book` class with:
   - Private fields: title, author, isbn, isAvailable
   - Constructor
   - Getters and setters
   - Methods: borrow(), return()

2. Create a `LibraryMember` class with:
   - Private fields: name, memberId, borrowedBooks (List<Book>)
   - Constructor
   - Getters and setters
   - Methods: borrowBook(Book book), returnBook(Book book)

3. Create a `Library` class that manages:
   - Private fields: books (List<Book>), members (List<LibraryMember>)
   - Methods: addBook(Book book), removeBook(Book book), addMember(LibraryMember member), removeMember(LibraryMember member)

Example usage:
```java
public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");
        library.addBook(book1);
        library.addBook(book2);

        // Add a member
        LibraryMember member = new LibraryMember("John Doe", "M001");
        library.addMember(member);

        // Member borrows a book
        member.borrowBook(book1);
        System.out.println(book1.isAvailable()); // Should print false
    }
}
```

## Exercise 2: Shape Hierarchy

Create a hierarchy of shapes using inheritance and polymorphism.

Requirements:
1. Create an abstract `Shape` class with:
   - Abstract method: calculateArea()
   - Abstract method: calculatePerimeter()

2. Create concrete classes that extend `Shape`:
   - `Circle` (radius)
   - `Rectangle` (width, height)
   - `Triangle` (base, height)

3. Each shape should implement its own area and perimeter calculations.

Example usage:
```java
public class Main {
    public static void main(String[] args) {
        // Create shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        // Calculate areas
        System.out.printf("Circle area: %.2f%n", circle.calculateArea());    // Should print ~78.54
        System.out.printf("Rectangle area: %.2f%n", rectangle.calculateArea()); // Should print 24.00
        System.out.printf("Triangle area: %.2f%n", triangle.calculateArea());   // Should print 6.00
    }
}
```


