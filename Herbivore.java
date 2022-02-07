// Unit 9.2

public class Herbivore extends Animal {
  public Herbivore(String s, String n) {
    super("herbivore", s, n);
  }

  public static void FRQ92Main() {
    Herbivore gary = new Herbivore("giraffe", "Gary");

    System.out.println("\n" + gary.toString());
  }
}