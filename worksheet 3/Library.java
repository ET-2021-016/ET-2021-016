// Class Library to manage the collection of books
import java.util.ArrayList;

class Library {
    // List to hold borrowable items
    private ArrayList<BorrowableItems> borrowableItemsList;

    // Constructor to initialize the list
    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    // Method to add items to the library
    public void addItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // Method to check out items (mark them unavailable)
    public void checkOutItem(String ISBN) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getISBN().equals(ISBN)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Book checked out: " + book.getTitle());
                    } else {
                        System.out.println("Book is already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Method to list all available items
    public void listAvailableItems() {
        System.out.println("Available Books:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                    System.out.println();
                }
            }
        }
    }

    // Method to display library information
    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Total available items: " + availableCount);
    }
}