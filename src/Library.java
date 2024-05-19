import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Danny Ken | 202430-CEN-3024C-31950 | 5/18/2024
This represents library that manages a collection of books.

Constructor:
public Library(): Initializes the books list as an empty ArrayList.

Methods in this class include:
public void addBook(Book book): Adds a Book object to the library's collection.
public void removeBook(int book): Removes a Book from the library based on its ID.
public void listBooks(): Displays the list of books in the library.
public void loadBooksFromFile(String filePath): Loads books from a file and adds them to the library.
public void saveBooksToFile(String filePath): Saves the library's books to a file.
 */
public class Library {
    private final List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(int book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book) {
                books.remove(i);
                return;
            }
            System.out.println("Book removed successfully!");
        }
    }

    public void listBooks() {
        System.out.println("Books in the Library: ");
        System.out.println("---------------------");
        System.out.println("ID | TITLE | AUTHOR");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------------");
    }

    public void loadBooksFromFile(String filePath) {
        try(Scanner scnr = new Scanner(new File(filePath))) {
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim();
                String author = parts[2].trim();
                Book book = new Book(id, title, author);
                books.add(book);
            }
            System.out.println("Books loaded successfully from the file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public void saveBooksToFile(String filePath) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            for (Book book : books) {
                writer.println(book.getId() + " | " + book.getTitle() + " | " + book.getAuthor());
            }
            System.out.println("Books saved successfully!");
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
