package main.runtime;

import java.util.ArrayList;
import java.util.Scanner;

public class RuntimePlaytime {

    public static void main(String[] args) {

        /*
         * EXAMPLE 1
         */
        String[] words = { "foo", "bar", "baz" };
        System.out.println(words[1]);

        // 🤔 What happens if we uncomment? Why?
        // What does the error say?
        // System.out.println(words[3]);

        /*
         * EXAMPLE 2
         */
        ArrayList<String> colours = new ArrayList<>(11);

        // 🤔 What happens if we uncomment? Why?
        // What does the error say?
        // colours.get(0);

        // What happens if we uncomment? Why?
        // What does the error say?
        // colours = new ArrayList<>(-2);

        /*
         * EXAMPLE 3
         */
        Scanner strScanner = new Scanner("My dog has fleas.");
        System.out.println(strScanner.next());

        // 🤔 What happens if we uncomment? Why?
        // What does the error say?
        System.out.println(strScanner.nextInt());
    }

}
