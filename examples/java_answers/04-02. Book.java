public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int quantity;
    private double price;

    // constructor
    public Book(String isbn, String title, String author, String genre, int quantity, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.price = price;
    }

    // set and get methods
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalValue() {
        return quantity * price;
    }

    public static void displayBook(Book book) {
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.printf("Total Stock Value: %.2f%n%n", book.getTotalValue());
    }
}

//---------------------------------------------------------------------
public class BookstoreTest {
    public static void main(String[] args) {
        
        Book book1 = new Book(
            "978-3-16-148410-0", 
            "The Great Gatsby", 
            "F. Scott Fitzgerald", 
            "Fiction", 
            30, 
            10.99
        );
        
        Book book2 = new Book(
            "978-0-7432-7351-7", 
            "The Road", 
            "Cormac McCarthy", 
            "Fiction", 
            20, 
            15.50
        );
        
        Book book3 = new Book(
            "978-0061120084", 
            "To Kill a Mockingbird", 
            "Harper Lee", 
            "Fiction", 
            25, 
            12.75
        );

        Book.displayBook(book1);
        Book.displayBook(book2);
        Book.displayBook(book3);
    }
}
