// Unit 6.2

public class Payroll {
  private int[] itemsSold; // number of items sold by each employee

  private double[] wages; // wages to be computed in part (b)

  // constructor for code outputs; places new items into array
  public Payroll() {
    itemsSold = new int[] { 48, 50, 37, 62, 38, 70, 55, 37, 64, 60 };
    wages = new double[10];
  }

  /**
   * Returns the bonus threshold as described in part (a).
   * 
   */

  public double computeBonusThreshold() {
    // start from first index in array of values in itemsSold
    int highest = itemsSold[0];
    int lowest = itemsSold[0];
    int sumOfItemsSold = itemsSold[0];

    double bonusThreshold = 0;

    // iterate over items , find sum of items sold, highest # of items sold, and
    // lowest # of items sold
    for (int i = 1; i < itemsSold.length; i++) {
      sumOfItemsSold += itemsSold[i];
      if (itemsSold[i] > highest)
        highest = itemsSold[i];
      if (itemsSold[i] < lowest)
        lowest = itemsSold[i];
    }

    System.out.println("The total sum of the items sold by the employees is " + sumOfItemsSold);
    System.out.println("The lowest number of items sold is " + lowest);
    System.out.println("The highest number of items sold is " + highest);

    // subtract the highest and lowest values from the sum of items sold within the
    // store then divide by 2 less than # of items within "itemsSold" array(8 items)
    bonusThreshold = (sumOfItemsSold - lowest - highest) / (itemsSold.length - 2.0);
    return bonusThreshold;
  }

  /**
   * Computes employee wages as described in part (b)
   * 
   * and stores them in wages.
   * 
   * The parameter fixedWage represents the fixed amount each employee
   * 
   * is paid per day.
   * 
   * The parameter perItemWage represents the amount each employee
   * 
   * is paid per item sold.
   * 
   */

  public void computeWages(double fixedWage, double perItemWage)
  {
    double bonusThresholdForWages = computeBonusThreshold();
    // from length of wages, declare each of the employee's wages and add 10% bonus
    for (int i = 0; i < wages.length; i++) {
      wages[i] = fixedWage + (itemsSold[i] * perItemWage);
      if (itemsSold[i] > bonusThresholdForWages) {
        wages[i] = wages[i] * 1.1; // which is 10 % extra of current wage of employee
      }
    }
  }

  // iterating to print out the items sold and wages of each employee based on
  // length of list of wages
  public void printWages() {
    for (int i = 0; i < wages.length; i++) {
      System.out.println("Employee = " + i + " ItemsSold = " + itemsSold[i] + " Wage = " + wages[i]);
    }
  }

  // Other instance variables, constructors, and methods not shown.

  public static void FRQ6Main() {
    // create object from payroll class
    Payroll payroll = new Payroll();
    // print out the amount of items that need to be sold for the bonus for their
    // wages
    System.out.println("Bonus threshold items are : " + payroll.computeBonusThreshold());
    System.out.println(" ");

    payroll.computeWages(10.0, 1.5);
    // run void function which printed out employee's information
    payroll.printWages();
    System.out.println(" ");
    System.out.println("Finished!");
  }
}