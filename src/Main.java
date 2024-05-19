import java.util.Scanner;

/*
Danny Ken | 202430-CEN-3024C-31950 | 5/18/2024
Main method for running the library management system.

Fields
Uses instances of library and scanner

Constructor:
public Library(): Initializes the books list as an empty ArrayList.

Methods in this class include:
public static void main(String[] args): Entry point for running the library system.
 */
public class Main {
    public static void main(String[] args) {


        Library library = new Library();
        Scanner scnr = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Add a Book \n2. Remove a Book \n3. List Books \n4. Load Books from .txt File \n5.Save Books in output.txt File \n6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the book ID: ");
                    int id = scnr.nextInt();
                    scnr.nextLine();
                    System.out.println("Enter the book title: ");
                    String title = scnr.nextLine();
                    System.out.println("Enter the book author: ");
                    String author = scnr.nextLine();
                    Book newBook = new Book(id, title, author);
                    library.addBook(newBook);
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.println("Enter the book ID to remove it from the list: ");
                    int removeId = scnr.nextInt();
                    scnr.nextLine();
                    library.removeBook(removeId);
                    System.out.println("Book removed successfully");
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    library.loadBooksFromFile("C:\\Users\\danny\\IdeaProjects\\Library Management System\\src\\input.txt");
                    library.listBooks();
                    System.out.println("Books listed and loaded successfully");
                case 5:
                    library.saveBooksToFile("C:\\Users\\danny\\IdeaProjects\\Library Management System\\src\\output" +
                            ".txt");
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Enter Another Choice.");
            }

        }

    }
}