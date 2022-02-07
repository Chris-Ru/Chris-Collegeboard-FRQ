// Unit 9.2

public class Elephant extends Herbivore {
  private double tuskLength;

  public Elephant(String n, double t) {
    super("elephant", n);
    tuskLength = t;
  }

  public String toString() {
    return super.toString() + " with tusks " + tuskLength + " meters long";
  }

  public static void FRQ92Main() {
    Elephant percy = new Elephant("Percy", 2.0);

    System.out.println("\n" + percy.toString());
  }
}