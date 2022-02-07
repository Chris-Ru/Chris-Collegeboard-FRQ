// Unit 8
import java.util.Scanner;

public class ExperimentalFarm {
  private Plot[][] farmPlots;

  public ExperimentalFarm(Plot[][] p) {
    this.farmPlots = p;
  }

  public Plot getHighestYield(String c) {
    Plot plot = null;
    int highest = this.farmPlots[0][0].getCropYield();

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        if (farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield() > highest) {
          highest = farmPlots[i][j].getCropYield();
          plot = farmPlots[i][j];
        }
      }
    }
    if (plot != null)
      return plot;
    else
      return null;

    /* to be implemented in part (a) */

  }

  public boolean sameCrop(int col) {
    boolean check = true;
    String crop = farmPlots[0][col].getCropType();

    for (int i = 0; i < 4; i++) {
      if (!farmPlots[i][col].getCropType().equalsIgnoreCase(crop)) {
        check = false;
        break;
      }
    }
    return check;
  }

  public static void FRQ8Main() {

    Plot p1 = new Plot("corn", 20);
    Plot p2 = new Plot("corn", 30);
    Plot p3 = new Plot("peas", 10);
    Plot p4 = new Plot("peas", 30);
    Plot p5 = new Plot("corn", 40);
    Plot p6 = new Plot("corn", 62);
    Plot p7 = new Plot("wheat", 10);
    Plot p8 = new Plot("corn", 50);
    Plot p9 = new Plot("rice", 30);
    Plot p10 = new Plot("corn", 55);
    Plot p11 = new Plot("corn", 30);
    Plot p12 = new Plot("peas", 30);

    Plot[][] plots = { { p1, p2, p3 }, { p4, p5, p6 }, { p7, p8, p9 }, { p10, p11, p12 } };

    ExperimentalFarm f = new ExperimentalFarm(plots);

    Plot highestYield = f.getHighestYield("corn");
    Plot highestYield1 = f.getHighestYield("peas");
    Plot highestYield2 = f.getHighestYield("bananas");

    try {
      System.out.println(highestYield.toString());
      System.out.println(highestYield1.toString());
      System.out.println(highestYield2.toString());
    } catch (Exception e) {
      System.out.println("null");
    }

    System.out.println("The method call f.sameCrop(0)");
    System.out.println(f.sameCrop(0));

    System.out.println("The method call f.sameCrop(1)");
    System.out.println(f.sameCrop(1));
  }
}