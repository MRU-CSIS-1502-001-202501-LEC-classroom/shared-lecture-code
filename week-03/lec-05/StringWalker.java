import java.util.Scanner;

public class StringWalker {
    public static void main(String[] args) {
        // Let's grab a string from the user, then print out
        // the letters in that string one line at a time.

        Scanner kbd = new Scanner(System.in);

        System.out.print("Your string? ");
        String userInput = kbd.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}