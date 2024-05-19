/*
Danny Ken | 202430-CEN-3024C-31950 | 5/18/2024

This LibraryTest Main java file is for TESTING PURPOSES ONLY!
To execute production main file, navigate to Main.java, otherwise use this file to test the functionality of the
methods for production for the production program.
 */

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUI libraryUI = new LibraryUI(library);

        /*
        // method for testing IO of file inside the program. Mainly pulls from input.txt. To check on local host
        change the directory of the file within the program to chosen file. Combines both loading and saving
        functionality.
        testFileIO(library);

        // tests the UI of the simple terminal with the 4 questions.
        testUserInterface(libraryUI);

        // loads and lists the books directly to the terminal from the input.txt file
        library.loadBooksFromFile("C:\\Users\\danny\\IdeaProjects\\Library Management System\\src\\input.txt");
        library.listBooks();

        // tests user input for the UI
        libraryUI.handleUserInput();
         */
    }
    private static void testUserInterface(LibraryUI libraryUI) {
        libraryUI.displayMenu();
        libraryUI.handleUserInput();
    }
    public static void testFileIO(Library library) {
        library.loadBooksFromFile("C:\\Users\\danny\\IdeaProjects\\Library Management System\\src\\input.txt");
        library.saveBooksToFile("C:\\Users\\danny\\IdeaProjects\\Library Management System\\src\\output.txt");
    }
}
