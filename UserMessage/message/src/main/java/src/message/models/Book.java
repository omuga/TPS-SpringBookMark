package src.message.models;

public class Book {
    private String isbn;
    private String title;
    private int precio;

    public Book(String isbn, String title, int precio){
        this.isbn = isbn;
        this.title = title;
        this.precio = precio;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTitle() {
        return title;
    }
}