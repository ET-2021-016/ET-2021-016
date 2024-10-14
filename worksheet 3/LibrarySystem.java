

// Main class to test the functionality
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Library instance
        Library library = new Library();

        // Creating Book objects using provided information
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuranakdaya Bauithka Nuladnaayakshanamaala", "Seymanaseakaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        // Adding books to the library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        // Display library information
        library.displayLibraryInfo();

        // List available items
        library.listAvailableItems();

        // Checking out a book
        library.checkOutItem("9789553548721");

        // List available items after checkout
        library.listAvailableItems();

        // Display library information after checkout
        library.displayLibraryInfo();
    }
}
