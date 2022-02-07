// Unit 10
import java.util.*;

public class NumberSystem {
  public static int GCF(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return (GCF(b, a % b));
    }
  }

  public static int reduceFraction(int a, int b) {
    return (a * b) / GCF(a, b);
  }

  public static void FRQ10Main() {
    Scanner sc = new Scanner(System.in);
    try {
      int f1, f2;
      System.out.print("Enter a positive integer: ");
      f1 = sc.nextInt();
      System.out.print("Enter a positive integer: ");
      f2 = sc.nextInt();
      if (f1 > 0 && f2 > 0) {
        System.out.printf("\nG.C.F of " + f1 + " and " + f2 + " is " + GCF(f1, f2));
        System.out.printf("\n\nL.C.M of " + f1 + " and " + f2 + " is " + reduceFraction(f1, f2) + "\n");
      } else {
        System.out.print("Positive inputs only");
      }
    } catch (InputMismatchException ex) {
      System.out.println("\nInput is not a valid integer");
    }
  }
}
