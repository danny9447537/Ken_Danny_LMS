/*
Danny Ken | 202430-CEN-3024C-31950 | 5/18/2024
This represents a book with an ID, title, and author.

Fields include:
private final int id: Unique identifier for the book.
private final String title: Title of the book.
private final String author: Author of the book.

Constructor:
public Book(int id, String title, String author): Initializes a Book object with provided details.

Methods in this class include:
public int getId(): Returns the book's ID.
public String getTitle(): Returns the book's title.
public String getAuthor(): Returns the book's author.
@Override public String toString(): Provides a string representation of the book.
 */
public class Book {
    private final int id;
    private final String title;
    private final String author;

    // Constructor for book object upon creation
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + author;
    }
}
