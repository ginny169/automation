package librarySystem;

import java.util.ArrayList;
import java.util.List;

/*
Create a Library class that manages:

Private fields: books (List), members (List)
Methods: addBook(Book book), removeBook(Book book), addMember(LibraryMember member), removeMember(LibraryMember member)

 */
public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library(){
        this.members = new ArrayList<>();
    }

    public void addBook(Book book){
        book.setLibrary(this);
    }
    public void removeBook(Book book){

    }
    public void addMember(LibraryMember member){
        members.add(member);
        member.setLibraryMember(true);
    }
    public void removeMember(LibraryMember member){

    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks(){
        return books;
    }
}
