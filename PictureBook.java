
// Unit 9.1
import java.util.*;

public class PictureBook extends Book {

  private String illustrator;

  public PictureBook(String title, String author, String illustrator) {
    super(title, author);
    this.illustrator = illustrator;
  }

  @Override
  public void printBookInfo() {
    System.out.print(title + ", written by " + author + " and illustrated by " + illustrator);
  }

  @Override
  public String toString() {
    return title + ", written by " + author + " and illustrated by " + illustrator;
  }

  public static void FRQ91Main() {
    System.out.println("\nUnit 9.1\n");

    Book myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");

    myBook.printBookInfo();

    ArrayList<Book> myLibrary = new ArrayList<Book>();

    /* missing code */
    Book book1 = new Book("Frankenstein", "Mary Shelley");
    
    PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

    myLibrary.add(book1);
    myLibrary.add(book2);

    for (int i = 0; i < myLibrary.size(); i++)     
      // Printing and display the elements in ArrayList
      System.out.print("\n" + myLibrary.get(i).toString() + "\n");       
    }
}