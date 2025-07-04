package librarySystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private Library library;

    public Book(String title, String author,String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setisAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void borrow(){
        if (isAvailable){
            isAvailable = false;
        }
    }

    public void returnB(){
        isAvailable = true;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
