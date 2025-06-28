package librarySystem;

public class Main {
    public static void main(String[] args) {
        // Create a library1
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");
        library1.addBook(book1);
        library1.addBook(book2);

        // Add a member
        LibraryMember member = new LibraryMember("John Doe", "M001",library1 );
        LibraryMember member2 = new LibraryMember("John Doe", "M002", library2 );

        library1.addMember(member);
        library2.addMember(member2);

        System.out.println(member.borrowBook(book1));
        System.out.println(member2.borrowBook(book2));
        System.out.println(member2.borrowBook(book2)); //cannot borrow book

    }
}
