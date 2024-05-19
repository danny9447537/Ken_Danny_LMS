import java.util.Scanner;
/*
Danny Ken | 202430-CEN-3024C-31950 | 5/18/2024

This LibraryUI java file is for TESTING PURPOSES ONLY!
Provides a user interface for interacting with the library.

Fields
private Library library: Reference to the Library object being managed.
private Scanner scnr: Scanner object for user input.

Constructor
public LibraryUI(Library library): Initializes the UI with a reference to the Library object.

Methods
public void displayMenu(): Displays a menu of options for interacting with the library.
public void handleUserInput(): Processes user input based on the displayed menu.
private void addBook(): Handles adding a new book to the library.
private void removeBook(): Handles removing a book from the library.
 */
public class LibraryUI {
    private Library library;
    private Scanner scnr = new Scanner(System.in);


    // Parameterized constructor for taking in library objects passed as an argument. Reads input to the console
    public LibraryUI(Library library) {
        this.library = library;
    }

    // displays menu for the library
    public void displayMenu() {
        System.out.println("1. Add a Book \n2. Remove a Book \n3. List Books \n4. Exit Program");
        System.out.println("Enter your choice: ");
    }

    // Checking to ensure user input is taking in information correctly with the usage of strings
    public void handleUserInput() {
        int choice = scnr.nextInt();
        scnr.nextLine();
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                removeBook();
                break;
            case 3:
                library.listBooks();
                break;
            case 4:
                System.out.println("Exit Program");
            default:
                System.out.println("Invalid choice");
        }
    }

    // functionality for adding a book
    private void addBook() {
        System.out.println("Enter the book ID: ");
        int id = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter the book title: ");
        String title = scnr.nextLine();
        System.out.println("Enter the book author: ");
        String author = scnr.nextLine();
        Book newBook = new Book(id, title, author);
        library.addBook(newBook);
        library.listBooks();
        System.out.println("Book added successfully");
    }

    // functionality for removing a book by ID
    private void removeBook() {
        int removeId = scnr.nextInt();
        scnr.nextLine();
        library.removeBook(removeId);
        System.out.println("Book removed successfully");
    }
}
