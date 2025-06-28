package librarySystem;

import java.util.ArrayList;
import java.util.List;

/*
Create a LibraryMember class with:

Private fields: name, memberId, borrowedBooks (List)
Constructor
Getters and setters
Methods: borrowBook(Book book), returnBook(Book book)
 */
public class LibraryMember {
    private String name;
    private String memberId;
    private boolean isLibraryMember = false;
    private List<Book> borrowedBooks;
    private Library library;

    public LibraryMember(String name, String memberId, Library library){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
        this.library = library;
    }

    //getter
    public String getName(){
        return name;
    }

    public String getMemberId(){
        return memberId;
    }

    public List<Book> getBorrowBooks(){
        return borrowedBooks;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }

    public String borrowBook(Book book){
        if (!book.getLibrary().equals(this.library)){
            return "Our library doesn't have this book";
        }
        if (book.isAvailable() && isLibraryMember){
            borrowedBooks.add(book);
            book.borrow();
            return "You borrowed a book successfully";
        } else return "Not available";
    }

    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            book.returnB();
            borrowedBooks.remove(book);
        } else System.out.println("error");
    }

    public boolean isLibraryMember() {
        return isLibraryMember;
    }

    public void setLibraryMember(boolean libraryMember) {
        isLibraryMember = libraryMember;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
