// Unit 9.2

public class Animal {
  private String classification;
  private String species;
  private String name;

  public Animal(String c, String s, String n) {
    classification = c;
    species = s;
    name = n;
  }

  public String toString() {
    String str = "";
    str = name + " the " + species + " is a " + classification;
    return str;
  }

  public static void FRQ92Main() {
    System.out.println("\nUnit 9.2\n");

    Animal lisa = new Animal("carnivore", "lion", "Lisa");
    
    System.out.println(lisa.toString());
  }
}