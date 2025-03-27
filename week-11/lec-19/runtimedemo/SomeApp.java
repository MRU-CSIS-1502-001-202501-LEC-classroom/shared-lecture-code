package main.runtimedemo;

import java.util.Scanner;

public class SomeApp {

    private SomeUsefulClass usefulObject;

    public SomeApp() {
        usefulObject = new SomeUsefulClass();
    }

    public void run() {
        Scanner kbd = new Scanner(System.in);

        System.out.print("What stuff's first character do you want? ");
        int stuffIndex = kbd.nextInt();
        System.out.println("Here's the first character: " + usefulObject.grabFirstCharFromStuff(stuffIndex));
        kbd.nextLine();

        System.out.println();

        // System.out.print("What other stuff do you want to display? ");
        // stuffIndex = kbd.nextInt();
        // System.out.println("Here's the other stuff: " +
        // usefulObject.getOtherStuff(stuffIndex));

        // System.out.println();

        // System.out.print("What stuff do you want to display? ");
        // stuffIndex = kbd.nextInt();
        // usefulObject.displayStuff(stuffIndex);

        System.out.println();
        System.out.print("What string should I find the magic number for? ");
        String userInput = kbd.nextLine();
        System.out.println("The magic number is: " + usefulObject.getMagicStringNumber(userInput));

        kbd.close(); // OK, since the app is done executing.
    }

}
