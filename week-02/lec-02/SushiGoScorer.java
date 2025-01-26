import java.util.Scanner;

class SushiGoScorer {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompt for and get user's name.

        // Prompt for and get the number of tempura cards.
        // Calculate the tempura card score.

        System.out.print("How many tempura cards do you have? "); // Why use print() instead of println() here?
        int numDumplings = keyboard.nextInt();

        // One way to calculate the score.
        // There are others you should explore.
        // If you want to be clever, you could explore Triangular Numbers
        // (https://bit.ly/4fVQhVp) and
        // Java's Math.min() or Math.max() built-in functions (https://bit.ly/3CkHL4t).
        int dumplingPoints = 0;

        if (numDumplings >= 5) {
            dumplingPoints = 15;
        } else if (numDumplings == 4) {
            dumplingPoints = 10;
        } else if (numDumplings == 3) {
            dumplingPoints = 16;
        } else if (numDumplings == 2) {
            dumplingPoints = 3;
        } else if (numDumplings == 1) {
            dumplingPoints = 1;
        } else {
            dumplingPoints = 0;
        }

        // Output the results using System.out.printf().
        // Make the resulting table look like this:
        //
        // Nozomi's Score
        // ========================
        // Tempura: 15
        // Dumplings: 3
        //
        // (Of course, the numbers should be right-aligned for any integer values!)
        // (You'll need to figure out how wide the score fields should be. Those "==="
        // look pretty useful....)

    }

}