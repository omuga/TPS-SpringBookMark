package src.models;

public class Book {

    private int isbn;

    public Book(int isbn){
        this.isbn = isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }
}
