import java.util.Scanner;

public class ScannerPlaytime {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int someInt = kbd.nextInt();
        System.out.println("That was a " + someInt);

        System.out.print("Enter a string with spaces: ");
        String someString = kbd.next();
        System.out.println("The first token was: " + someString);

        someString = kbd.next();
        System.out.println("The second token was: " + someString);
    }

    public static void main2(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int someInt = kbd.nextInt();
        System.out.println("That was a " + someInt);

        System.out.print("Enter a string with spaces: ");
        String someString = kbd.nextLine();
        System.out.println("The string was: " + someString);
    }
}
