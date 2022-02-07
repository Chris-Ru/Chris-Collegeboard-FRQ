// FRQ 5.1

import java.util.Scanner;

public class Invitation {
  private String hostName;
  private String address;

  public Invitation(String n, String a) {
    hostName = n;
    address = a;
  }

  // Unit 5a (a)
  public String getHost() {
    return hostName;
  }

  // Unit 5a (b)
  public void setAddress(String a) {
    address = a;
  }

  // Unit 5a (c)
  public String createInvite(String name) {
    String invite = "Dear " + name + ", please attend to my event that will take place at " + address + ". Can't wait to see you a the event " + hostName + "!";
    return invite;
  }

  // Unit 5a (d)
  public void Invitation(String a) {
    address = a;
    hostName = "Host";
  }
  
  public static void FRQ5Main(Scanner scanner) {
    // Scanner scanObj = new Scanner(System.in);

    Invitation myInvite = new Invitation(/*hostname, their address*/"Gertrude", "671 Lincoln Ave");

    // Unit 5a (a)
    // print out hostname
    System.out.println("Hostname: " + myInvite.getHost());

    // Unit 5a (b)
    // print out address
    System.out.println("Input new address:");
    String newAdd = scanner.nextLine();
    myInvite.setAddress(newAdd);

    // Unit 5a (c)
    System.out.println("Input the recipient's name:");
    String name = scanner.nextLine();
    System.out.println(myInvite.createInvite(name));

    // Unit 5a (d)
    // theirInvite uses the one-parameter constructor
    Invitation theirInvite = new Invitation("bruh", "1234 Walnut Street");
    theirInvite.setAddress(newAdd);
    System.out.println(" ");
    System.out.println(theirInvite.createInvite(name));

    // Close scanner
    // scanner.close();
  }

}