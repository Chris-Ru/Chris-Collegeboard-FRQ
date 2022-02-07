// FRQ 5.2

import java.util.ArrayList;

public class PasswordGenerator {

  // String[] passwordArray = {};
  static ArrayList<String> passwords = new ArrayList<String>();

  private int pwLength;
  private String prefix;

  // Constructor
  public PasswordGenerator(int pwLength, String prefix) {
    this.pwLength = pwLength;
    this.prefix = prefix;
  }

  // Statement 2
  public int pwCount() {
    int numberOfPasswords = passwords.size();
    return numberOfPasswords;
  }

  // Statement 3 & 4
  public String pwGen() {
    String tempPassword = prefix + ".";
    // Iteration
    for (int i = 0; i < pwLength; i++) {
      int tempChar = ((int)(Math.random() * 9));
      tempPassword = tempPassword + tempChar;
    }
    // Store tempPassword into the passwords arrayList
    passwords.add(tempPassword);
    // Return tempPassword value
    return tempPassword;
  }

  // Statement 6 (Constructor)
  public PasswordGenerator(int pwLength) {
    this.pwLength = pwLength;
    prefix = "A";
  }

  public static void FRQ5Main() {
    
    // Statement 1
    PasswordGenerator pw1 = new PasswordGenerator(4, "chs");

    // Test Statement 2
    System.out.println(pw1.pwCount());

    // Test Statement 3 + 4
    System.out.println(pw1.pwGen());
    System.out.println(pw1.pwGen());

    // Test Statement 5
    System.out.println(pw1.pwCount());

    // Statement 6
    PasswordGenerator pw2 = new PasswordGenerator(6);

    // Test Statement 7
    System.out.println(pw2.pwCount());

    // Test Statement 8
    System.out.println(pw2.pwGen());

    // Test Statement 9 + 10
    System.out.println(pw2.pwCount());

    System.out.println(pw1.pwCount());
  }

}

