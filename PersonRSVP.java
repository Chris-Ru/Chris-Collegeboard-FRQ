// FRQ 3

import java.util.Scanner;

class PersonRSVP {
  // protected data
  private boolean rsvp;
  private int selection;
  private String attending;
  private String theFood = "";

  // constructor
  public PersonRSVP(int selection, String theFood, boolean rsvp) {
    this.selection = selection;
    this.theFood = theFood;
    this.rsvp = rsvp;
  }

  // get protected data
  public int getSelection(int n) {
    selection = n;
    return selection;
  }

  public String gettheFood() {
    return theFood;
  }

  public boolean getRSVP(boolean a) {
    rsvp = a;
    return rsvp;
  }

  // call class
  public static void FRQ3Main(Scanner scanner) {
    // Scanner sc = new Scanner(System.in);

    PersonRSVP myPersonRSVP = new PersonRSVP(1, "food", true);

    System.out.println("Will you be attending the event?(true or false):");

    String bool2 = scanner.nextLine();
    boolean bool = true;

    if (bool2.equals("true")){
      bool = true;
    } 
    else{
      bool = false;
    }

    
    if (bool == true) {
      myPersonRSVP.getRSVP(bool);
      System.out.println("");

      // could have used switch instead but no more time to finish
      System.out.println("what would you like to eat?(beef(1), chicken(2), pasta(3), fish(anything != 1,2 or 3))");
      int new2 = Integer.parseInt(scanner.nextLine());
      if (new2 == 1) {
        myPersonRSVP.getSelection(new2);
        System.out.println("");
        System.out.print("Thanks for attending. You will be served beef.");
      } else if (new2 == 2) {
        myPersonRSVP.getSelection(new2);
        System.out.print("\nThanks for attending. You will be served chicken.");
      } else if (new2 == 3) {
        myPersonRSVP.getSelection(new2);
        System.out.print("\nThanks for attending. You will be served pasta.");
      } else {
        myPersonRSVP.getSelection(new2);
        System.out.print("\nThanks for attending. You will be served fish.");
      }
    } else if (bool == false) {
      System.out.println("\nSorry you can't make it.");
    }
  }
}
