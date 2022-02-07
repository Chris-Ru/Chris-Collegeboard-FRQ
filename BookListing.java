// Unit 9.1
import java.util.ArrayList;

public class BookListing {

  private Book myBook;
  private double cost;

  public BookListing(Book b, double c) {
    myBook = b;
    cost = c;
  }

  public void printDescription() {
    myBook.printBookInfo();
    System.out.print(", $" + cost);
  }

  public static void FRQ91Main() {    
    ArrayList<Book> myLibrary = new ArrayList<Book>();

    Book book1 = new Book("Frankenstein", "Mary Shelley");
    
    PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

    BookListing listing1 = new BookListing(book1, 10.99);
    listing1.printDescription();
    System.out.print("\n\n");


    BookListing listing2 = new BookListing(book2, 12.99);
    listing2.printDescription();
    System.out.print("\n");
  }
}