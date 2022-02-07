import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean run = true;

    while (run == true) {
      System.out.println("\nEnter an integer(1-10) for the FRQ you would like to see running.");

      try {
        int FRQ = Integer.parseInt(scanner.nextLine());
        
        if (FRQ == 1) {
          System.out.println("This FRQ does not exist");
          run = false;
        }

        else if (FRQ == 2) {
          System.out.println("This FRQ is currently being worked on");
          run = false;
          // LightSeq.FRQ2Main();
        }

        else if (FRQ == 3) {
          // Has User Input
          PersonRSVP.FRQ3Main(scanner);
          System.out.println("\n\nGraphing for Unit 3.2 is linked here: https://nighthawkrecruiting.tk/graph?x0=1&y0=1&l=1");
        }

        else if (FRQ == 4) {
          longestStreak.FRQ4Main();
          // CoinGame.FRQ4Main();
        }

        else if (FRQ == 5) {
          //Has User Input
          System.out.println("Unit 5.1 \n");
          Invitation.FRQ5Main(scanner);
          System.out.println("\nUnit 5.2 \n");
          PasswordGenerator.FRQ5Main();
        }

        else if (FRQ == 6) {
          System.out.println("Unit 6.1 \n");
          FRQ6.FRQ6Main();
          System.out.println("Unit 6.2 \n");
          Payroll.FRQ6Main();
        }

        else if (FRQ == 7) {
          UserName.FRQ7Main();
        }

        else if (FRQ == 8) {
          ExperimentalFarm.FRQ8Main();
        }

        else if (FRQ == 9) {
          // System.out.println("This FRQ is currently being worked on");
          // run = false;
          PictureBook.FRQ91Main();
          BookListing.FRQ91Main();
          Animal.FRQ92Main();
          Herbivore.FRQ92Main();
          Elephant.FRQ92Main();
        }

        else if (FRQ == 10) {
          // Has User Input
          NumberSystem.FRQ10Main();
        }

        else if (FRQ > 10) {
          System.out.println("\nThis FRQ does not exist \n");
        }
      } 
      
      catch (NumberFormatException e) {
        System.out.println("\nInput is not a valid integer");
      }
    }
    scanner.close();
  }
}