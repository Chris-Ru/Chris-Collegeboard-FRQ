// Unit 9.1

public class Book {
  protected String title;
  protected String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void printBookInfo() {
    System.out.print(title + ", written by " + author);
  }

  public String toString() {
    return title + ", written by " + author;
  }
}