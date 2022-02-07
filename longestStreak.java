// Unit 4.1
public class longestStreak {
  static String str = "CCAAAAATTT!";
  static String input;

  public longestStreak(String str) {
    this.str = str;
  }

  public static void FRQ4Main() {
    System.out.println("Unit 4.1");

    // This initializes the initial character to an empty character

    char previousChar = ' ';

    // This initializes the current and the longest streak to an empty string

    String largestStreak = "", currentStreak = "";

    // This iterates through the string
    for (int i = 0; i < str.length(); i++) {
      // This checks if the current character and the previous character are not the
      // same
      if (str.charAt(i) != previousChar) {
        // If yes, the streak is reset
        currentStreak = "";
      }

      // The streak continues here
      currentStreak += str.charAt(i);
      // This checks the length of the longest streak
      if (currentStreak.length() > largestStreak.length()) {
        largestStreak = currentStreak;
      }
      // This sets the previous character to the current character
      previousChar = str.charAt(i);
    }
    // This takes the user's input and prints the longest streak and its length

    longestStreak frq1 = new longestStreak(str);
    
    System.out.println("Longest word " + str + " has the largest character sequence of character " + largestStreak.charAt(0) + " and is " + largestStreak.length() + " long");
  }
}

// public class FRQ4 {

// static String myString;
// static int largestSequence = 0;
// static char longestChar = '\0';

// public FRQ4(String myString) {
// this.myString = myString;
// }

// public String getmyString(String n) {
// myString = n;
// return myString;
// }

// public static void FRQ4Main() {
// FRQ4 frq = new FRQ4(" ");

// int currentSequence = 1;
// char current = '\0';
// char next = '\0';

// for (int i = 0; i < myString.length() - 1; i++) {
// current = myString.charAt(i);
// next = myString.charAt(i + 1);

// // If character's are in sequence , increase the counter
// if (current == next) {
// currentSequence += 1;
// } else {
// if (currentSequence > largestSequence) { // When sequence is
// // completed, check if
// // it is longest
// largestSequence = currentSequence;
// longestChar = current;
// }
// currentSequence = 1; // re-initialize counter
// }
// }
// if (currentSequence > largestSequence) { // Check if last string
// // sequence is longest
// largestSequence = currentSequence;
// longestChar = current;
// }

// }
// }