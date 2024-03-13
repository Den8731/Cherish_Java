import java.util.ArrayList;
import java.util.List;

class Bookorganizer {
    private List<String> books;
    public Bookorganizer(){
        this.books = new ArrayList<>();
    }
    public void addBook(String bookTitle){
        books.add(bookTitle);
    }

    public void removeBook(String bookTitle){
        books.remove(bookTitle);
    }
    public void listBooks(){
        System.out.println("Books to organize: ");
        for(String book: books ){
            System.out.println("- " + book);
        }

    }
    public static <string> void main(String[] args) {

        Bookorganizer organizer = new Bookorganizer();

        //Retrieval of entry point for field
        organizer.addBook("Remarkably Bright Creatures");
        organizer.addBook("The Second Worst Restaurant in France");

        organizer.listBooks();

        organizer.removeBook("Clean Code");

        // Listing books after removal
        organizer.listBooks();

    }
}