// FRQ 6.1

public class FRQ6 {
  // Print in terminal by running then typing "java Q1" to run in terminal
  public static void FRQ6Main() {
    // instantiate array named "words"
    String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

    // Print out the length of the array "words"
    System.out.println("The length of the string 'words' is " + words.length + "\n");

    // Enhanced for loop to iterate through array then making each word into a string in the variable "word"
    int index=0;
    for (String word : words) {

      // checks to see if suffix of word contains "ing"
        if (word.endsWith("ing")){
          // if word contains "ing" then prints that word
          System.out.println(String.valueOf(index++)+": " + word);
        }
    }
    
    System.out.println("\nFinished!\n");
    }
}